import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        double a1=0;
        double[] dam = new double[n];
        double[] mount = new double[n];
        for(int i=0;i<n;i++) {
            double d=Double.parseDouble(st.nextToken());
            if(i%2==0){
                a1+=d;
            }else{
                a1-=d;
            }
            dam[i]=d;
        }
        mount[0]=a1;
        System.out.print((int)mount[0]);
        for(int i=0;i<n-1;i++){
            mount[i+1] = (dam[i]-mount[i]/2)*2;
            System.out.print(" ");
            System.out.print((int)mount[i+1]);
        }
        System.out.println("\n");
    }
}
