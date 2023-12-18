import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                int yono = 10000000;
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                        int pct = 0;
                        while(a[i] % 2 == 0){
                                pct++;
                                a[i] /= 2;
                        }
                        yono = Math.min(yono , pct);
                }
                System.out.println(yono);
        }
}
//鶏になれ