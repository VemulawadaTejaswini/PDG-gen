import java.util.Scanner;

public class Main{
	static int[][] visit=new int[51][51];
	static int H;
	static int W;
	public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		H=sc.nextInt();
    		W=sc.nextInt();
    		for(int i=0; i<H; i++) {
    			String str=sc.next();
    			for(int j=0; j<str.length(); j++) {
    				visit[i][j]=str.charAt(j)-'0';
    			}
    		}
    		for(int i=0; i<H; i++) {
    			for(int j=0; j<W; j++) {
    				if(i==0 && j==0) {
    					visit[i][j]=visit[i][j];
    				}
    				else if(i==0) {
    					visit[i][j]+=visit[i][j-1];
    				}
    				else if(j==0) {
    					visit[i][j]+=visit[i-1][j];
    				}
    				else {
    					visit[i][j]+=Math.min(visit[i-1][j], visit[i][j-1]);
    				}
    			}
    		}
    		System.out.println(visit[H-1][W-1]);
    	}
    }
}
