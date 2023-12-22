import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] team = new int[n+1];
		
		for(int i =0;i< n*(n-1)/2;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(c > d){
				team[a]+=3;
			}else if(c < d){
				team[b]+=3;
			}else{
				team[a]+=1;
				team[b]+=1;
			}
		}
		
		for(int i =1;i<=n;i++){
			int c = 1;
			for(int k=1;k<=n;k++){
				if(team[i]<team[k]){
					c++;
				}
			}
			System.out.println(c);
		}

	}

}