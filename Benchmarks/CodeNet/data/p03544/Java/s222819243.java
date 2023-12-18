import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                long[] yono = new long[n + 1];
                yono[0] = 2;
                yono[1] = 1;
                for(int i = 2 ; i <= n ; i++){
                        yono[i] = yono[i - 1] + yono[i - 2];
                }
                System.out.println(yono[n]);
                sc.close();
        }
}//0=48
//鶏になれ