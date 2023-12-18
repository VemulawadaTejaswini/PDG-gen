import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] t = new int[ N ];
		int[] x = new int[ N ];
		int[] y = new int[ N ];
		
		for(int i = 0 ; i < N ; i++){
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		boolean result = true;
		for(int i = 0; i < N ; i++){
			if( !canReach( t[i] , x[i] ,y[i] ) ||  !isEven( t[i] , x[i] ,y[i] )){
				result = false;
				break;
			}
		}
		System.out.println(result ? "Yes" : "No");
	}
	
	static boolean canReach(int t , int x , int y){
		
		if(x < 0 ){ x = x * (-1);}
		if(y < 0 ){ y = y * (-1);}
		
		return  t >= (x + y);
		
	}
	
	static boolean isEven(int t , int x , int y){
		
		return (t % 2) == ( (x + y ) % 2);
	}
	
}