
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a_x = new int[n];
        int[] a_y = new int[n];
        int[] a_h = new int[n];

        int[][] map = new int [101][101];

        int temp = 0;
        boolean flag = false;

        for(int i = 0;i < n;i++){
            a_x[i] = sc.nextInt();
            a_y[i] = sc.nextInt();
            a_h[i] = sc.nextInt();
        }

        boolean k_flag = true;

        for(int i = 0;i < n;i++){
            map[a_x[i]][a_y[i]] = a_h[i];
        }

        for(int i = 0;i <= 100;i ++){
            for(int j = 0;j <= 100;j ++){
                flag = true;
                k_flag = true;
                for(int k = 0;k < n;k ++){
                    if(a_h[k]!=0) {
                        if (k_flag) {
                            temp = Math.abs(a_x[k] - i) + Math.abs(a_y[k] - j) + a_h[k];
                            k_flag = false;
                        }

//                    System.out.println(i + " " + j + " " + temp);

                        if (temp != Math.abs(a_x[k] - i) + Math.abs(a_y[k] - j) + a_h[k]) {
                            flag = false;
                            break;
                        }
                    }
                }

                for(int k = 0;k < n;k ++){
                    
//                    System.out.println(i + " " + j + " " + temp);

                        if (temp != Math.abs(a_x[k] - i) + Math.abs(a_y[k] - j) + a_h[k]) {
                            flag = false;
                            break;
                        }
                    
                }

                if(flag){
                    System.out.println(i + " " + j + " " + temp);
                }
            }
        }

    }
}
