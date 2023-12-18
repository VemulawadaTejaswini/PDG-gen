import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] x = new int[ N ];
		int[] y = new int[ N ];
		boolean[] c = new boolean[ N ];
		boolean[] d = new boolean[ N ];
		
		for(int i = 0 ; i < N ; i ++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = ( "B".equals( sc.next() ) );
		}
		
		int maxFillCount = 0;
		
		for(int p = 0 ; p < K  ; p++){
			for(int q = 0 ; q < K ; q++){
				for(int i = 0 ; i < N ; i++){
					d[i] = isBlack(K , x[i] - p , y[i] - q );
				int count = Math.max(fillCount(c,d) , N - fillCount(c,d));
				if(maxFillCount < count ){
//					System.out.printf("( %d , %d )\n",p ,q );
					maxFillCount = count;
				}
			}
		}
		
		System.out.println(maxFillCount);
	}
	
	static boolean isBlack(int K , int x , int y){
		int Kx = x / K ;
		int Ky = y / K ;
		
		return ( Kx + Ky ) % 2 == 0 ;
	}
	
	static int fillCount(boolean[] c , boolean[] d){
		int cnt = 0 ;
		for(int i = 0 ; i < c.length ; i ++){
//			System.out.println("c[" + i + "] = " + c[i] + " ,d[" + i + "] = " + d[i] );
			
			if(c[i] == d[i]){
				cnt ++;
			}
		}
		return cnt;
	}
}
