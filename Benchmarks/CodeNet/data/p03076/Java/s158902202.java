import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] a = new int[5];
                int last = 0;
                int[] b = new int[5];
                for(int i = 0 ; i < 5 ; i++){
                        a[i] = sc.nextInt();
                        if(a[i] % 10 == 0){
                                b[i] = 10;
                        }else{
                                b[i] = a[i] % 10;
                        }
                        if(b[last] > b[i]) last = i;
                }
                int yono = 0;
                yono += a[last];
                a[last] = 0;
                for(int i = 0 ; i < 5 ; i++){
                        a[i] = (int)Math.ceil(a[i] / 10.0);
                        a[i] *= 10;
                        yono += a[i];
                }
                System.out.println(yono);
        }
}//0=48
//鶏になれ