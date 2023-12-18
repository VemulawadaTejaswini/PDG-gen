import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] cards = new long[n];
        for(int i = 0; i < n; i++) {
        	cards[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
        	int b = sc.nextInt();
        	long c = sc.nextInt();
        	Arrays.sort(cards);
        	int j = 0;
        	while(cards[j] < c) {
        		j++;
        		if(j == n) break;
        	}
        	if(j <= b) {
        		for(int k = 0; k < j; k++) {
        			cards[k] = c;
        		}
        	}else {
        		for(int k = 0; k < b; k++) {
        			cards[k] = c;
        		}
        	}
        }
        
        long sum = 0;
        for(int i = 0; i < n; i++) {
        	sum += cards[i];
        }
        System.out.println(sum);
    }
}