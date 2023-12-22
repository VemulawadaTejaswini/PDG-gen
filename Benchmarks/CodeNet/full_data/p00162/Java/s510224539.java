import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ham = new int[1000001];
		for(int i=1;i<=1000000;i*=3){
			for(int j=1;j*i<=1000000;j*=2){
				for(int k=1;k*j*i<=1000000;k*=5) ham[k*j*i]=1;
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int m = sc.nextInt();
			int sum = 0;
			for(int i=n;i<=m;i++){
				if(ham[i]==1) sum++;
			}
			System.out.println(sum);
		}	
	}	
}