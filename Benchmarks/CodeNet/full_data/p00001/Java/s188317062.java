import java.util.Arrays;
import java.util.Scanner;



class Main{


   public static void main(String[] a){


	        Scanner sc = new Scanner(System.in);
	        int[] d = new int[10];

	        for(int i = 0; i < d.length; i++){
	        	d[i] = sc.nextInt();
	        }

	        Arrays.sort(d);

	        for(int i = 9; i > 6 ; i--){
	        	System.out.println(d[i]);
	        }


     }



}