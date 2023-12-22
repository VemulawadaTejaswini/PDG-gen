import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new  Scanner (System.in);
        String str = s.nextString();
        Integer[] mt = new Integer[10];
        String[] asd = str.split("\n",-1);
        for(int i=0;i<10;i++){
            mt[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        System.out.println(asd[9]);
        System.out.println(asd[8]);
        System.out.println(asd[7]);
        
    }
}