
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] array = new int[n];
        int add = 0;
        double ave = 0;

        for(int i = 0;i < n;i++){

            a[i] = sc.nextInt();
            array[i] = a[i];

            add += a[i];

        }
        

        ave = (double)add / n;
        int index = 0;
        double sub=100;
//        System.out.println(ave);
        for(int i = 0;i < n;i++){
            if(Math.abs(ave - a[i]) < sub){
                index = i;
                sub = Math.abs(ave - a[i]);
            }
        }

        System.out.println(index);






    }
}
