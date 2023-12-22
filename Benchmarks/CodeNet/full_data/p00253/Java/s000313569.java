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
			if(n==4){
				if(h[3]-h[2]==h[2]-h[1] && h[2]-h[1]==h[1]-h[0]){
					System.out.println(h[4]);
				}else if(h[4]-h[2]==h[2]-h[1] && h[2]-h[1]==h[1]-h[0]){
					System.out.println(h[3]);
				}else if(h[4]-h[3]==h[3]-h[1] && h[3]-h[1]==h[1]-h[0]){
					System.out.println(h[2]);
				}else if(h[4]-h[3]==h[3]-h[2] && h[3]-h[2]==h[2]-h[0]){
					System.out.println(h[1]);
				}else{
					System.out.println(h[0]);
				}
		
			}else if(n>4){
				int sub = 0;
				int[] d = new int[5];
				for(int i=0;i<5;i++){
					d[i] = h[i+1]-h[i];
				}
				Arrays.sort(d);
				sub = d[2];
				
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
}