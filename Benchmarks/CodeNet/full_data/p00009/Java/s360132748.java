import java.util.*;

public class nine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n;
		int count;
		boolean[] flag = new boolean[100001];
		
		while(true){
			count = 0;
			if(!sc.hasNext())break;
			n = sc.nextInt();
			
			for(int i=0;i<=n;i++)flag[i] = true;
			
			for(int i=2;i<=Math.sqrt(n)+1;i++){
				if(!flag[i])continue;
				for(int j=i*2;j<=n;j+=i){
					flag[j] = false;
				}
			}
			for(int i=2;i<=n;i++){
				if(flag[i])++count;
			}
			System.out.println(count);
		}
	}
}