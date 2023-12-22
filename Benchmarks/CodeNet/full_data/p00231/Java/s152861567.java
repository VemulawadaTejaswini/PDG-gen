import java.util.*;

public class Main {
	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] w = new int[n];
			int [] s = new int[n];
			int [] e = new int[n];
			for(int i =0; i < n;i++){
				w[i] = sc.nextInt();
				s[i] =sc.nextInt();
				e[i] = sc.nextInt();
				
			}
			boolean flg = true;
			for(int i =0; i < n;i++){
				int wei = w[i];
				for(int j =0 ;j < n; j++){
					if(i == j) continue;
					if(s[j] <= s[i] && s[i] < e[j]){
						wei += w[j];
						if(wei > 150){
							flg = false;
							break;
						}
					}
					
				}
				if(! flg){
					break;
				}
			}
			if(flg){
				System.out.println("OK");
			
			}
			else{
				System.out.println("NG");
			}
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}