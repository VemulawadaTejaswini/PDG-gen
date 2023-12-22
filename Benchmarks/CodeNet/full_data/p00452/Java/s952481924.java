import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		if(n==0 && m==0) break;
        		Integer [] score = new Integer[n+1];
        		for(int i=0;i<n;i++) {
        			score [i] = sc.nextInt();
        		}
        		score[n] = 0;
        		//Arrays.sort(score, Collections.reverseOrder());
        		
        		for(int j=n;j>0;j--) {
        			for(int i=0;i<j;i++) {
            			if(score[i]<score[i+1]) {
            				int temp = score[i];
            				score[i] = score[i+1];
            				score[i+1] = temp;
            			}
            		}
        		}
        	   
        		loop:
        		for(int a:score) {
        			for(int b:score) {
        				for(int c:score) {
        					for(int d:score) {
        						if(a+b+c+d<=m) {
        							System.out.println(a+b+c+d);
        							break loop;
        						}
        					}
        				}
        			}
        		}
        		
        	}
        }
    }
}
   
