import java.util.Scanner;

//Combination of Number Sequences
public class Main{

	static int n, s, c;
	static boolean[] used;
	
	static void dfs(int k, int sum){
		if(k==n){
			if(sum==s)c++;
			return;
		}
		if(s < sum)return;
		for(int i=0;i<10;i++){
			if(!used[i]){
				used[i] = true;
				dfs(k+1, sum+(k+1)*i);
				used[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			c = 0;
			used = new boolean[10];
			dfs(0,0);
			System.out.println(c);
		}
	}
}