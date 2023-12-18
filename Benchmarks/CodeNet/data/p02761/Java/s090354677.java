import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int data[] = new int[N+1];
		
		int M = sc.nextInt();
		for(int i=0 ;i<M ;i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(data[s] == 0) {
				data[s]=c;
			}else {
			data[s]= Math.min(data[s],c);
			}
		}
		if(data[1]==0) {
			System.out.println(-1);
		}else {
			for(int i = 1;i<N+1;i++) {
				System.out.print(data[i]);
			}
		}
		
	}
}

