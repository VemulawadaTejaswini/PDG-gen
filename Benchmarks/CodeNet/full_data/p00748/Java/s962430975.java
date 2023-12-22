import java.util.*;

public class Main {
	int n;
	int[] b = new int[180];
	int[] c = new int[45];
	int[] d = new int[1000000];
	int[] e = new int[1000000];
	ArrayDeque<Integer> list = new ArrayDeque<Integer>();
	
	public void init(){
		int sum=0;
		for(int i=1;i<=180;i++){
			b[i-1]=(i*(i+1)*(i+2))/6;
			if(b[i-1]%2==1){
				c[sum]=b[i-1];
				sum++;
			}
		}
	}
	
	public void funcA(){
		list.offer(0);
		int z=1;
		int i=0;
		while(z<1000000){
			i++;
			int x = list.size();
			for(int j=0;j<x;j++){
				int y = list.poll();
				for(int k=0;k<180;k++){
					int sum = y + b[k];
					if(sum<1000000 && d[sum]==0){
						d[sum]=i;
						list.offer(sum);
						z++;
					}
				}	
			}
		}
	}
	
	public void funcB(){
		list.clear();
		list.offer(0);
		int z=1;
		int i=0;
		while(z<1000000){
			i++;
			int x = list.size();
			for(int j=0;j<x;j++){
				int y = list.poll();
				for(int k=0;k<45;k++){
					int sum = y + c[k];
					if(sum<1000000 && e[sum]==0){
						e[sum]=i;
						list.offer(sum);
						z++;
					}
				}	
			}
		}
	}
	
	public void print(){
		System.out.println(d[n] + " " + e[n]);
	}
	
	public static void main(String[] args) {
		Main C = new Main();
		Scanner sc = new Scanner(System.in);
		C.init();
		C.funcA();
		C.funcB();
		int exit=0;
		while(exit==0){
			C.n = sc.nextInt();
			if(C.n==0)exit=1;
			if(exit==0){	
				C.print();
			}
		}
	}
	
}