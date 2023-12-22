import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[][][] = new int[4][3][10]; 
        String str[];
        int b,f,r,v;
        while(n-->0){
            str = br.readLine().split(" ");
            b = Integer.parseInt(str[0]);
            f = Integer.parseInt(str[1]);
            r = Integer.parseInt(str[2]);
            v = Integer.parseInt(str[3]);
            a[b-1][f-1][r-1] = a[b-1][f-1][r-1] + v;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    System.out.print(" "+a[i][j][k]);
                }
                System.out.println();
            }
            if(i!=3) System.out.println("####################");
        }
    }
}