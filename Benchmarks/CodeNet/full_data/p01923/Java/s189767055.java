import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		if(n==0 && m==0) break;
        		int [] dif = new int[m+1];
        		for(int i=1;i<=m;i++) {
        			dif[i] = 0;
        		}
        		for(int i=0;i<n;i++) {
        			int d = sc.nextInt();
        			int v = sc.nextInt();
        			if(v>dif[d]) {
        				dif[d] = v;
        			}
        		}
        		int sum = 0;
        		for(int i=1;i<=m;i++) {
        			sum += dif[i];
        		}
        		System.out.println(sum);
        	}
        }
    }
}

