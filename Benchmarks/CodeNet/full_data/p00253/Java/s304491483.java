import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] h = new int[n+1];
			for(int i=0;i<=n;i++){
				h[i] = sc.nextInt();
			}
			int sub = 0;
			int[] d = new int[3];
			d[0] = h[1] - h[0];
			d[1] = h[2] - h[1];
			d[2] = h[3] - h[2];
			if(d[0]==d[1])sub=d[0];
			else if(d[1]==d[2])sub=d[1];
			else if(d[2]==d[0])sub=d[2];
			
			for(int i=0;i<n;i++){
				if(h[i+1]-h[i]!=sub){
					if(i==n-1){
						System.out.println(h[i+1]);
						break;
					}else if(h[i+2]-h[i+1]!=sub){
						System.out.println(h[i+1]);
						break;
					}else{
						System.out.println(h[i]);
						break;
					}
				}
			}
			
		}
	}
}