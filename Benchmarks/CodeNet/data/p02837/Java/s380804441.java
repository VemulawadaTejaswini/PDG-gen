import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			ArrayList<ArrayList<SG>>deta= new ArrayList<ArrayList<SG>>();
			for(int i = 0;i<N;i++) {
				ArrayList<SG>list = new ArrayList<SG>();
				deta.add(list);
			}
			
			int[]A  = new int[N];
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				for(int j = 0;j<A[i];j++) {
					deta.get(i).add(new SG(scan.nextInt(),scan.nextInt()));
				}
			}
			
			int max = 0;
			
			for (int i=0; i<(int)(Math.pow(2,N)); i++) {
				StringBuffer s =new StringBuffer();
				int []usohon =new int[N]; 
				s.append(1);
				for (int k=0; k<N; k++) {
					if ((1&i>>k) == 1) {
						s.append(1);
						usohon[k]=1;
					}
					else {s.append(0);}
				}
				int shoujiki = digsum(Integer.valueOf(s.toString()))-1;
				s.append(s.toString().substring(0, N+1));
				s.delete(0, N+1);
				int []mujun = new int[N];
				int dame = 0;
				Arrays.fill(mujun, 9);
				
				outside:for(int z = 0;z<deta.size();z++) {
					if(usohon[z]==0)continue;
					for(int j = 0;j<deta.get(z).size();j++) {
						SG C = deta.get(z).get(j);
						int X = C.x;  int Y = C.y;
						if(mujun[X-1]==9) {
							mujun[X-1]=Y;
						}
						if(mujun[X-1]!=9&&mujun[X-1]!=Y) {
							dame = 1;
							break outside;
						}
					}
				}
				
				/*
				System.out.print(s);
				System.out.print(" ");
				System.out.print(dame);
				System.out.print(" ");
				
				for(int h = 0;h<N;h++) {
					System.out.print(mujun[h]);
					System.out.print(" ");
				}
				for(int h = 0;h<N;h++) {
					System.out.print(usohon[h]);
					System.out.print(" ");
				}
	
				System.out.println(shoujiki);
				*/
				if(dame==0) {
					
				char []c = s.toString().toCharArray();
				int ok = 1;
				for(int w = 0;w<N;w++) {
					if(mujun[w]==9)continue;
					if(c[w]!='0'+mujun[w]) {ok=0;
					break;
					
					}
				}
				if(ok==1&&max<shoujiki) {
					//System.out.println(s);
					max = shoujiki;
				}
				
				
				}
				
		
					
		
			}
		
		
			System.out.println(max);
			
			
			
		}
	}
	
	
	
	
	
	private static int digsum(int n) {//数字ｎの桁和
		int res = 0;
		while(n>0) {
			res+=n%10;//10で割った余りは一の位の桁に等しい
			n/=10;//一桁入れ終わったので削除
		}
		return res;
	}
	
	
	
	static class SG{
		int x;
		int y;
		SG(int X,int Y){
			x = X;y = Y;
		}
	}
		

}
