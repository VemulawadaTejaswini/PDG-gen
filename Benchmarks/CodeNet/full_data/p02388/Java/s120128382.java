public class Main{
         public static int calculateCube(int x){
		int result = 0;
		if ( x >= 1 || x <= 100 ){
	            result = x*x*x;
		}
		return result;		
	}

	public static void main(String[] args){
                   int cubic = calculateCube(2);
		System.out.println(cubic);
	}
}