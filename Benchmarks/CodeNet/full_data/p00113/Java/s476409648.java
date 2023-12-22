import java.util.Arrays;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	void solve(int p,int q){
		int[] remainder=new int[q];
		Arrays.fill(remainder,-1);
		
		int end;
		int d=0;
		p%=q;
		for(end=0;p!=0&&remainder[p]==-1;++end){
			remainder[p]=end;
			p*=10;
			d=p/q;
			System.out.print(d);
			p%=q;
		}
		System.out.println();
		if(p!=0){
			for(int i=0;i<end;++i){
				System.out.print(i<remainder[p]?' ':'^');
			}
			System.out.println();
		}
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			solve(ni(),ni());
		}
		
		sc.close();
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}