import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
			int n=sc.nextInt();
			int block[]=new int[n];
			int umax=0,dmax=0;
			
			for(int i=0; i<n; i++){
				block[i]=sc.nextInt();
			}

			for(int i=1; i<n; i++){
				if(block[i-1] < block[i]){
					if(umax < (block[i]-block[i-1])){
						umax=block[i]-block[i-1];
					}
				}
				else {
					if(dmax < block[i-1]-block[i]){
						dmax=block[i-1]-block[i];
					}
				}
			}
			System.out.println(umax+" "+dmax);
		}
	}
}