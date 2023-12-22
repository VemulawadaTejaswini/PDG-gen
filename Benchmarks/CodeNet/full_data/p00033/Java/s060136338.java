import java.util.*;
public class Main {
	boolean ans;
	int a, b;
	int [] data;
	private void dfs(int deep){
		if(deep == 10){
			ans = true;
			return;
		}
		if(data[deep] > a){
			int temp = a;
			a = data[deep];
			dfs(deep+1);
			a = temp;
		}
		if(data[deep] > b){
			int temp = b;
			b = data[deep];
			dfs(deep+1);
			b = temp;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			data = new int[10];
			for(int i = 0; i < 10; i++){
				data[i] = sc.nextInt();
			}
			a = -1;
			b = -1;
			ans = false;
			dfs(0);
			if(ans){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}