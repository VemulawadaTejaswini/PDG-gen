import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++)
			x[i] = sc.nextInt();
		
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=0;j<n;j++){
				if(j!=i){
					sum = sum^x[j];
				}
			}
			System.out.println(sum);
		}
	}
}
