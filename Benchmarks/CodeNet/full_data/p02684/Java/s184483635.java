import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long K=sc.nextLong();
		int[] tel= new int[N];
		for(int i=0;i<N;i++) {
			tel[i]= sc.nextInt();
		}
		int ans = 0;
		int cnt= 0;
		int[] pass=new int[N];
		int from=0;
		int[] loop = new int[2];
		
		for(int i=0;i<K;i++) {
			from = tel[from]-1;
			cnt+=1;
			if(pass[from]==0) {
				pass[from]=cnt;
			}else {
				loop[0]=pass[from];
				loop[1]=cnt;
				break;
			}
			if(cnt==K) {
				ans=from;
			}
		}
		
		if(cnt<K) {
			long nokori = ((K-(long)cnt)%(loop[1]-loop[0]));
			for(int i=0;i<nokori;i++) {
				from = tel[from]-1;
			}
			ans=from;
		}
		System.out.println(ans+1);
		
	}

}