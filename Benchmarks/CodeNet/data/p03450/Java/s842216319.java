import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		X[] x = new X[ N ];
		for(int i = 0 ; i < N ; i ++){
			x[i] = new X(N,i);
		}
		
		
		int M = sc.nextInt();
		
		for(int i = 0 ; i < M ; i ++){
			int L = sc.nextInt() - 1;
			int R = sc.nextInt() - 1;
			int D = sc.nextInt();
			
			x[L].distance[R] =  D     ;
			x[R].distance[L] = -1 * D ;
		}
		
		for(int i = 0 ; i < N ; i ++){
			System.out.println(x[i]);
			x[i].printDistance();
		}
		
		boolean result = false;
		
		for(int xx =0 ; xx < N ; xx ++){
			for(int yy =0 ; yy < N ;yy ++ ){
				for(int zz =0 ; zz < N ; zz ++){
					if( x[xx].distance[yy] != 0 &&x[yy].distance[zz] != 0 && x[xx].distance[zz] != 0 ){
						result = x[xx].distance[zz] == x[xx].distance[yy] + x[yy].distance[zz];
					}
				}
			}
		}
		
		System.out.println(result ? "Yes" : "No");
	}
}

class X{
	int[] distance ;
	int num ;
	
	X(int N ,int i ){
		this.distance = new int[N];
		this.num = i;
		distance[i] = 0;
	}
	public String toString(){
		return "class X : num = " + this.num ;
	}
	public void printDistance(){
		for(int i = 0 ; i < this.distance.length ; i ++){
		System.out.printf( "X[ %d] distance of X[%d] = %d  \n" ,this.num , i , this.distance[i]);
		}
	}
}

