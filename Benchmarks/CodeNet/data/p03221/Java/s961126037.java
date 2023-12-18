
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] City=new int[M][2];
		int[] sort = new int [M];
		int [] tag = new int[N];
	
	
		for(int i=0;i<M;i++) {
			City[i][0]=sc.nextInt();
			int x = sc.nextInt();
			City[i][1]=x;
			sort[i]=x;
			
		}
		Arrays.sort(sort);

		for(int i=0;i<M;i++) {
			int x =sort[i];
			for(int j=0;j<M;j++) {
				int y =City[j][0];
				int z=City[j][1];
				if(x==z){
					if(tag[y-1]!=0) {
						City[j][1]=tag[y-1];
						System.out.println(City[j][1]);
						tag[y-1]=tag[y-1]+1;
					}else {
						tag[y-1]=1;
						City[j][1]=tag[y-1];
						tag[y-1]=tag[y-1]+1;
					}
					break;
				}
			}
		}
		
		for(int i=0;i<M;i++) {
			System.out.print(String.format("%06d", City[i][0]));
			System.out.println(String.format("%06d", City[i][1]));
		}
			
					
	}

}
