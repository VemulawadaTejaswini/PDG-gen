import java.util.*;
public class Main {
	
	public static int[][] arrays ;
	public static int[] answer;
	public static int n;
	
	public static void tree(int a,int c) {
		for(int i=0;i<n-1;i++) {
			if(arrays[i][0] == a) {
				int b = arrays[i][1];
				if(answer[b] == -1) {
					answer[b] = color(c,arrays[i][2]);
					tree(b,answer[b]);
					
				}
			}
			
			if(arrays[i][1] == a) {
				int b = arrays[i][0];
				if(answer[b] == -1) {
					answer[b] = color(c,arrays[i][2]);
					tree(b,answer[b]);
				}
				
			}
			
			
		}
		
	}
	
	public static int color(int a,  int w) {
		if(a == 0) {
			return (w%2 == 0) ? 0 : 1;
		} else {
			return (w%2 == 0) ? 1 : 0;		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arrays =  new int[n-1][3];
		answer = new int[n];
	 
		for(int i=0;i<n;i++)
			answer[i] = -1;
		
		
		for(int i=0;i<n-1;i++) {
			arrays[i][0] = sc.nextInt() -1;
			arrays[i][1] = sc.nextInt() -1;
			arrays[i][2] = sc.nextInt();
		}
		
		int a = arrays[0][0];
		int b = arrays[0][1];
		int w = arrays[0][2];
		
		answer[a] = 0;
		answer[b] = (w % 2 == 0) ? 0 : 1;
		
		tree(a,0);
		tree(b,answer[b]);
		

		for(int i:answer) {
			System.out.println(i);
		}
		
	}
}