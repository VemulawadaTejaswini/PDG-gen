import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		new Main().doIt();
	}
	void doIt() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
				String[] str = br.readLine().split(" ");
				int n = Integer.parseInt(str[0]);
				int x = Integer.parseInt(str[1]);
				if(n==0&&x==0) break;
				
				System.out.println(ways(n, x));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	int ways(int n, int x){
		int count = 0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				for(int k=1; k<=n; k++){
					if(((i+j+k)==x)&&(i!=j)&&(j!=k)&&(k!=i)){
						count++;
					}
				}
			}
		}
		return count/(3*2*1);
	}
}