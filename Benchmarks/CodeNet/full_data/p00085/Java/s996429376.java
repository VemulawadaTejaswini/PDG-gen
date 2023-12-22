import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			int m = cin.nextInt();
			if(n+m==0){
				break;
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			boolean[] is = new boolean[n];
			for(int i = 0; i < n;i++){
				is[i]=true;
				list.add(i);
			}
			int now = n-1;
			int count=0;
			while(true){
				int cnt=0;
				while(true){
					if(is[(now+1)%n]){
						now = (now+1)%n;
						cnt++;
					}
					else{
						now = (now+1)%n;
					}
					if(cnt==m){
						break;
					}
				}
				is[now]=false;
				count++;
				if(count==n-1){
					break;
				}
			}
			for(int i = 0; i < n;i++){
				if(is[i]){
					System.out.println(i+1);
					break;
				}
			}
		}
	}

}