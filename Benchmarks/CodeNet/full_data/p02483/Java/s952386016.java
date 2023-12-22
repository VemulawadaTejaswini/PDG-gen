import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int  i=0;i<=2;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<=2;i++){
		      System.out.println(a[i]+" ");
	        }
	}
}