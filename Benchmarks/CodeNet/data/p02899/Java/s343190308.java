import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++)
			x[i] = sc.nextInt();
		int t = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(x[j]==t){
					System.out.print((j+1)+" ");
					t++;
					break;
				}
			}
		}
	}
}
