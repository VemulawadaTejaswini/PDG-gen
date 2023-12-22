import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        int max = 0;
        int min = 0;
       for(int i = 0; i < n;i++){
    	   a[i] = sc.nextInt();
    	   max = a[0];
    	   min = a[0];;
       }
       for(int i = 0; i < n; i++){
    	   if(max < a[i]){
    		   max = a[i];
    	   }
    	   if(min > a[i]){
    		   min = a[i];
    	   }
    	   sum += a[i];
       }
       System.out.println(min + " " + max + " " + sum);
    }
}
