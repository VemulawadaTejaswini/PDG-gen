import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int []A = new int[N];
			
			ArrayList<ArrayList<SG>> L = new ArrayList<ArrayList<SG>>();
			for(int i = 0;i<N;i++) {
				ArrayList<SG> list = new ArrayList<SG>();
				A[i] = scan.nextInt();
				for(int j = 0;j<A[i];j++) {
					list.add(new SG(scan.nextInt(),scan.nextInt()));
				}
				L.add(list);
			}
			
			int max = 0;
			
			
			for(int i = 0;i<(int)Math.pow(2, N);i++) {
				
				int []usohon = new int[N];
				int shoujiki = 0;
				
				for(int j = 0;j<N;j++) {
					if((1&i>>j)==1) {
						usohon[j]=1;
						shoujiki++;
					}
				}
				
				int ok = 1;
				
				outside: for(int j = 0;j<N;j++) {
					if(usohon[j]==0)continue;
					for(int z = 0;z<A[j];z++) {
						if(usohon[L.get(j).get(z).x-1]!=L.get(j).get(z).y) {
							ok=0;
							break outside;
						}	
					}
				}
				
				if(ok==1&&max<shoujiki) max =shoujiki;

			}
			
			System.out.println(max);
			
		}
	}
	
	static class SG{
		int x;int y;
		SG(int X ,int Y){x = X;y = Y;}
	}
		

}
