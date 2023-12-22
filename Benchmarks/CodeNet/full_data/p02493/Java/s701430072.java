import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n;
		n=cin.nextInt();
		int[] x = new int[n];
			for(int i=0;i<n;++i){
				x[i]=cin.nextInt();
			}
			while(true){
				if(n!=1 && n!=0){
					System.out.print(x[n-1]+" ");
					n=n-1;
				}
				if(n==1){
					System.out.print(x[n-1]);
				}
				if(n==0){
					break;
				}
			}
	}