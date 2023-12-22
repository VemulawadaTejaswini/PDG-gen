import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] S = new int[n];
	
	for(int i = 0;i<n;i++){
		S[i] = in.nextInt();
	}
	int q = in.nextInt();
	int[] T = new int[q];
	for(int i = 0;i<q;i++){
		T[i] = in.nextInt();
	}
	System.out.println(count(S,T,n,q));
	
	}
	
	public static int count(int[] s,int[] t, int n, int q){
		int C = 0;
		for(int i = 0;i<q;i++){
			int temp = t[i];
			for(int j = 0;j<n;j++){
				if(s[j] == temp) C++;
			}
		}
		return C;
	}

}