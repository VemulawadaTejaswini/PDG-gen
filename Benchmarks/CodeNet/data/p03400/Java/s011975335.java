import java.util.*;


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int[ N ] ;
		for(int i = 0 ; i < N ; i ++){
			A[i] = sc.nextInt();
		}
		
		int result = 0 ;
		for(int i = 0 ; i < N ; i ++){
			result = result + 1 + ( D - 1 ) / A[ i ] ;
		}
		result = result + X;
		
		System.out.println(result);
	}
}
