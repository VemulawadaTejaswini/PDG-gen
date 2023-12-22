import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pm = 1000000;
		boolean[] prime = new boolean[pm+1000];
		for(int i=2;i<=pm;i++) prime[i] = true;
		for(int i=2;i<=pm+1;i++){
			for(int j=i+i;j<=pm;j+=i){
				prime[j]=false;
			}
		}
		
		while(true){
			int[] in = new int[2];
			in[0] = sc.nextInt();
			in[1] = sc.nextInt();
			if(in[0]==0 && in[1]==0) break;
			
			int[] m = new int[2];
			for(int i=0;i<2;i++){
				int max = -1;
				for(int j=in[i];j>1;j--){
					if(prime[j] && in[i]%j==0){
						if(max==-1) max = j;
						else m[i] += j;
					}
				}
				m[i] = max - m[i];
			}
			if(m[0]>m[1]) System.out.println("a");
			else System.out.println("b"); 
		}
	}
}