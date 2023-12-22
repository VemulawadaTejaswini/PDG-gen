import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		final Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] matrix=new int[n+1];
		matrix[0]=matrix[1]=1;
		for(int i=2;i<=n;i++){
			matrix[i]=matrix[i-1]+matrix[i-2];
		}
		System.out.println(matrix[n]);
	}
	
}