import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum=0;
		int[] reg = new int[N];
		for(int i=0;i<N;i++){
			reg[i]=sc.nextInt();
		}
		int reg2;
		for(int i=0;;i++){
			if(reg[i]==1){
				reg2=i;break;
			}
		}
		int reg3=0;
		for(int i=1;reg2!=0;i++){
			sum+=K-1;
			if(reg2<=sum){
				reg3=i;
				break;
			}
		}
		sum=0;
		for(int i=1;reg2!=N-1;i++){
			sum+=K-1;
			if(N-1-reg2<=sum){
				reg3+=i;
				break;
			}
		}
		System.out.println(reg3);
		
	}
}