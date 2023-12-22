import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        int i=0;
        
        try{
            n = scan.nextInt();
            int j=n-1;
            int[] a = new int[n];
            int[] b = new int[n];
            for(i=0; i<n; i++){
                a[i] = scan.nextInt();
                b[j] = a[i];
                j--;
            }
            scan.close();
            for(j=0; j<n-1; j++){
                System.out.printf("%d ", b[j]);
            }
            System.out.printf("%d", b[n-1]);
            System.out.printf("\n");
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
