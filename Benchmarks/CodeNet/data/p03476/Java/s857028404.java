import java.util.*;


class Main{
	static int[] isPrimeFlag ;
	static int[] cntAccumlasion2017LikeNumbers;
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] l = new int[ N ];
		int[] h = new int[ N ];
		
		
		createIsPrimeTable(100000);
		createCntAccumlasion2017LikeNumbers(100000);
		
		
		
		for(int i = 0 ; i < N ; i ++){
			l[i] = sc.nextInt();
			h[i] = sc.nextInt();
			
			int L = l[i] == 1 ? 0 :  l[i] - 1 - 1  ;
				
			System.out.println( "ansewer " + ( cntAccumlasion2017LikeNumbers[ h[i] - 1  ] - cntAccumlasion2017LikeNumbers[ L ] ) );
		}
	}
	
	static void createIsPrimeTable(int N){
		
		isPrimeFlag = new int[N];
		isPrimeFlag[0] = -1;
		int cursor = 0;
		
		//isPrimeFlag = 0 なる数を探す
		for(int i = 1; i < N ; i++){
			if(isPrimeFlag[i] == 0){
				cursor = i;
				
				for(int j = cursor ; j < N ; j =  j + cursor + 1 ){
					isPrimeFlag[ j ] = j == cursor ? 1 : -1;
				}
			}
		}
	}
	
	
	/**
	*@param num 1以上
	*/
	static boolean is2017LikeNumber(int num){
		boolean result = false;
		if( num % 2 != 0  && isPrimeFlag[num - 1] == 1  ){
			result = isPrimeFlag[ ( num  + 1 )/2 - 1 ] == 1 ? true : false ;
		}
		return result;
	}
	
	static void createCntAccumlasion2017LikeNumbers(int N){
		
		cntAccumlasion2017LikeNumbers = new int[N];
		cntAccumlasion2017LikeNumbers[0] = 0;
		
		for(int i = 1 ; i < N  ; i ++){
			cntAccumlasion2017LikeNumbers[ i ] = 
			is2017LikeNumber(i + 1) ? cntAccumlasion2017LikeNumbers[ i - 1] + 1 :
				                      cntAccumlasion2017LikeNumbers[ i - 1]   ;
		}
	}
}
