import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
	   int []arr =new int[n];
	   for(int i=0;i<n;i++){
		   arr[i]=scn.nextInt();
		   
	   }
Arrays.sort(arr);
             long sum=0;
             for(int i=0;i<k;i++){
            	 sum+=arr[i];
             }
             System.out.println(sum);
	}

}