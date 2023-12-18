import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];
		int Y[] = new int[N];
		int H[] = new int[N];


		for(int n=0;n<N;n++){
			X[n] = sc.nextInt();
			Y[n] = sc.nextInt();
			H[n] = sc.nextInt();
		}

		outside:for(int y=0;y<=100;y++){
			for(int x=0;x<=100;x++){
				int h = -1;
				int n;
				boolean flag = true;
				for(n=0;n<N;n++){
					if(flag){
						h = H[n]+Math.abs(X[n]-x)+Math.abs(Y[n]-y);
						if(H[n]!=0) flag = false;
					}else{
						int hh = H[n]+Math.abs(X[n]-x)+Math.abs(Y[n]-y);
						if(H[n] != 0 && h != hh) break;
						if(H[n] == 0 && h-(Math.abs(X[n]-x)+Math.abs(Y[n]-y))>0) break;
					}
				}

				if(n==N){
					System.out.println(x+" "+y+" "+h);
					break outside;
				}
			}			
		}
	}
}