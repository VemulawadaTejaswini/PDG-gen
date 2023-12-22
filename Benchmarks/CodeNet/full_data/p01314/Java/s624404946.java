import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve2440();
	}

	public static void solve2440() {
		Scanner sc = new Scanner(System.in);
		while(true){
            double n = sc.nextInt();
            if(n==0) {
            	break;
            }
    		int cnt = 0;
    		for(int i=1;i<n/2;i++) {
        		int a = 0;
	            for(int j=i ;n>a;j++) {
	            	a+=j;
	            	if(n==a) {
	            		cnt++;
	            		break;
	            	}
	            }
    		}
    		System.out.println(cnt);
        }
	}
}
