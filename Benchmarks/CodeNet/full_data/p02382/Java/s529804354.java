import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x_y;
        double p1=0,p2=0,p3=0,pinf=0;
        String str[] = br.readLine().split(" ");
        String str2[] = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            x_y = Math.abs(Integer.parseInt(str[i]) - Integer.parseInt(str2[i]));
            p1 += x_y;
            p2 += Math.pow(x_y, 2);
            p3 += Math.pow(x_y, 3);
            if(pinf<x_y) pinf = x_y;
        }
        p2 = Math.sqrt(p2);
        p3 = Math.cbrt(p3);
        System.out.printf("%.6f\n%.6f\n%.6f\n%.6f\n", p1,p2,p3,pinf);
    }
}