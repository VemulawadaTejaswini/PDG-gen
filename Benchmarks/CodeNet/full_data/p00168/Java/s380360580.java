import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int DP(int n){
		int result = 0;
		int x[] = new int [n+1];
		x[0] = 1;
		for(int i = 1;i < n+1;i++){
			for(int j = 1;j <= 3;j++){
				if(i - j >= 0){
					x[i] = x[i] + x[i-j];
				}
			}
		}
		result = ((x[n] / 10) / 365) + 1; 
		return result;
	}
	void doIt() { 
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			System.out.println(DP(n));
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}