import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] a = new int[n];
       int i;
       for(i=0; i<a.length ;i++){
           a[i] = sc.nextInt();
       }
       for(i = n-1 ;i >= 0;i--){
           if( i == 0){
               System.out.println(a[i]);
           }
           else{
            System.out.print(a[i] + " ");
           }
       }
       //System.out.println("");
   } 
}
