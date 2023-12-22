
import java.util.Scanner;

public class Main {
	 static class Unionfind{
		int[] number;
		
		Unionfind(int n){
			number = new int[n];
			for(int i=0;i<n;i++){
				number[i] = i;
			}
		}
		
		int find(int x){
			if(number[x]==x){
				return x;
			}
			return number[x] = find(number[x]);
		}
		
		void unite(int x,int y){
			if(number[x]==number[y]){
				
			}
			else{
				number[find(x)] = number[find(y)];
			}
		}
		
		void same(int x,int y){
			if(number[find(x)]==number[find(y)]){
				System.out.println("1");
			}
			else{
				System.out.println("0");
			}
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int q =stdIn.nextInt();
		Unionfind union = new Unionfind(n);
		
		for(int i=0;i<q;i++){
			int com = stdIn.nextInt();
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			if(com==0){
				union.unite(x, y);
			}
			else{
				union.same(x, y);
			}
		}
		
	}
}