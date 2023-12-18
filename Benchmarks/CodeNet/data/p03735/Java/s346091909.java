public class Main {
	
public static void main(String[] args) {
		
		//System.out.println("d");
		
		Scanner sc = new Scanner( System.in );
		int N = sc.nextInt();
		
		int max_x = Integer.MIN_VALUE;
		int max_y = Integer.MIN_VALUE;
		int min_x = Integer.MAX_VALUE;
		int min_y = Integer.MAX_VALUE;
		
		int x = 0;//2つのうち小さいほう
		int y = 0;//2つのうち大きいほう
		int itizi = 0;
		
		for( int i = 0;i < N;i++ ){
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if( x > y ){
				itizi = y;
				y = x;
				x = itizi;
			}
			
			max_x = Math.max( x, max_x );
			min_x = Math.min( x, min_x );
			max_y = Math.max( y, max_y );
			min_y = Math.min( y, min_y );
			
		}
		
		/*
		System.out.println(max_x);
		System.out.println(min_x);
		System.out.println(max_y);
		System.out.println(min_y);
		*/
		long a = (long)Math.abs(max_x- min_x) * (long)Math.abs(max_y- min_y);
		long b = (long)Math.abs(max_x- min_y) * (long)Math.abs(max_y- min_x);
		
		if( a > b )
			System.out.println( b );
		else
			System.out.println( a );
		
		
	}

}
