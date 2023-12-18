import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int height = sc.nextInt();
		final int width = sc.nextInt();
		
		final int square = height * width;
		
		int result = Integer.MAX_VALUE;
		if( square%3 == 0){
			result = 0;
		} else {
			//　一辺が同じ分割
			if( 3 < height ){
				int maxSide = height/3+ 1;
				int minSide = (height-maxSide)/2;
				int diff = (maxSide - minSide)* width;
				if( diff < result ){
					result = diff;
				}
			}
			if( 3 < width ){
				int maxSide = width/3+ 1;
				int minSide = (width-maxSide)/2;
				int diff = (maxSide - minSide)* height;
				if( diff < result ){
					result = diff;
				}
			}
			
			// heightを分割せずに最大面積に含む
			int maxWSide = width/3 + 1;
			int maxSQ = height * maxWSide;
			int minSQ = (width - maxWSide) * (height/2);
			if( (maxSQ -minSQ) < result ){
				result = (maxSQ-minSQ);
			}
			
			// widthを分割せずに最大面積に含む
			int maxHSide = height/3 + 1;
			maxSQ = width * maxHSide;
			minSQ = (height - maxHSide) * (width/2);
			if( (maxSQ -minSQ) < result ){
				result = (maxSQ-minSQ);
			}

		}
		
		
		
		System.out.println(result);
	}

	

}