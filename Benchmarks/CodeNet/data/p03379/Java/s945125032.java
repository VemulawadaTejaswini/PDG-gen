import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //個数
        int n = sc.nextInt();

        //数
        int[] x = new int[n];
        int[] s = new int[n];
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
            s[i] = x[i];
        }

        int y,ans;
        for(int i = 0;i < n;i++){
            x[i] = 0;
            //ソート
            Arrays.sort(x);
            ans = x[n/2];
            System.out.println(ans);
//            for(int j = 0;j < n;j++) {
//                System.out.println("x[" + j + "] = " + x[j]+ ", s[" + j + "] = " + s[j]);
//            }
            System.arraycopy(s,0,x,0,s.length);
        }
    }
}