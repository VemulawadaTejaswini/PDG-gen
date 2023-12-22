import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		if(n==0 && m==0) break;
        		int [] score = new int[n+1];
        		for(int i=0;i<n;i++) {
        			score [i] = sc.nextInt();
        		}
        		score[n] = 0;
        		int [] sum = new int [(n+1)*(n+1)];
        		for(int i=0;i<n+1;i++) {
        			for(int j=0;j<n+1;j++) {
        	        	sum[(n+1)*i+j] = score[i]+score[j];
            		}
        		}
        		Arrays.sort(sum);
        		search:
        			for(int i=m;i>0;i--) {
        				for(int j=0;j<(n+1)*(n+1);j++) {
        					int low = 0;
            				int high = sum.length;
            				while(low<high) {
            					int mid = (low+high)/2;
            					if(sum[mid]==i-sum[j]) {
            						System.out.println(i);
            						break search;
            					}else if(sum[mid]>i-sum[j]) {
            						high = mid;
            					}else if(sum[mid]<i-sum[j]) {
            						low = mid+1;
            					}
            				}
        				}
        			}
        	}
        }
    }
}
