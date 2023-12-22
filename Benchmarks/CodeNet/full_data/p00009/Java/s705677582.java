import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int count;
		
					
		boolean[] flag = new boolean[100001];
			
		Arrays.fill(flag,true);
			
		for(int i=2;i<=Math.sqrt(100000)+1;i++){
			if(!flag[i])continue;
			for(int j=i*2;j<=100000;j+=i){
				flag[j] = false;
			}
		}
		while(true){
			count = 0;
			if(!sc.hasNext())break;
			n = sc.nextInt();
			
			for(int i=2;i<=n;i++){
				if(flag[i])++count;
			}
			System.out.println(count);
		}
	}
}