import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int i,j=0,k=0,l=0;
			int sum[] = new int [2000];
			int ave[] = new int [2000];

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int score[] = new int [n];

			for(i=0;i<n;i++){
				score[i] = sc.nextInt();
				sum[l]+=score[i];
			}
			for(i=0;i<n;i++){
				if(score[i]>=score[j]){
					j=i;
				}
				if(score[i]<=score[k]){
					k=i;
				}
			}
			sum[l]-=score[j];
			sum[l]-=score[k];
			ave[l] = sum[l]/(n-2);
			l++;
		}
		for(i=0;i<l;i++){
			System.out.printf("%d\n",ave[i]);
		}
	}
}