import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	if(n + m == 0) break;
        	int a[] = new int[n];
        	for(int i=0;i<n;i++) {
        		a[i] = sc.nextInt();
        	}
        	Arrays.sort(a);
        	if(a[0] + a[1] > m) {
        		System.out.println("NONE");
        		continue;
        	}
        	int max = 0;
        	for(int i=0;i<n;i++) {
        		for(int j=i+1;j<n;j++){
        			if(a[i] + a[j] <= m) {
        				max = Math.max(a[i] + a[j], max);
        			}
        		}
        	}
        	System.out.println(max);
        }
    }
}
