import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final boolean PattarnA[][] = { 
		{true, true},
		{true, true}
	};
	
	public static final boolean PattarnB[][] = { 
		{true},
		{true},
		{true},
		{true}
	};
	
	public static final boolean PattarnC[][] = { 
		{true, true, true, true}
	};
	
	public static final boolean PattarnD[][] = { 
		{false, true},
		{true, true},
		{true, false}
	};
	
	public static final boolean PattarnE[][] = { 
		{true, true, false},
		{false, true, true}
	};
	
	public static final boolean PattarnF[][] = { 
		{true, false},
		{true, true},
		{false, true}
	};
	
	public static final boolean PattarnG[][] = { 
		{false, true, true},
		{true, true, false}
	};
	
	
	private static boolean checkA(boolean data[][], int sy, int sx){
		if(8<=(sy+1) || 8<=(sx+1)){
			return false;
		}
		boolean array[][] = new boolean[2][2];
		array[0] = Arrays.copyOfRange(data[sy], sx, sx+2);
		array[1] = Arrays.copyOfRange(data[sy+1], sx, sx+2);
		
		return Arrays.deepEquals(array, PattarnA);
	}
	private static boolean checkB(boolean data[][], int sy, int sx){
		if(8<=(sy+3)){
			return false;
		}
		boolean array[][] = new boolean[4][1];
		array[0] = Arrays.copyOfRange(data[sy], sx, sx+1);
		array[1] = Arrays.copyOfRange(data[sy+1], sx, sx+1);
		array[2] = Arrays.copyOfRange(data[sy+2], sx, sx+1);
		array[3] = Arrays.copyOfRange(data[sy+3], sx, sx+1);
		
		return Arrays.deepEquals(array, PattarnB);
	}
	private static boolean checkC(boolean data[][], int sy, int sx){
		if(8<=(sx+3)){
			return false;
		}
		boolean array[][] = new boolean[1][4];
		array[0] = Arrays.copyOfRange(data[sy], sx, sx+4);
		
		return Arrays.deepEquals(array, PattarnC);
	}
	private static boolean checkD(boolean data[][], int sy, int sx){
		if(8<=(sy+2) || (sx-1)<0){
			return false;
		}
		boolean array[][] = new boolean[3][2];
		array[0] = Arrays.copyOfRange(data[sy], sx-1, sx+1);
		array[1] = Arrays.copyOfRange(data[sy+1], sx-1, sx+1);
		array[2] = Arrays.copyOfRange(data[sy+2], sx-1, sx+1);
		
		return Arrays.deepEquals(array, PattarnD);
	}
	private static boolean checkE(boolean data[][], int sy, int sx){
		if(8<=(sy+1) || 8<=(sx+2)){
			return false;
		}
		boolean array[][] = new boolean[2][3];
		array[0] = Arrays.copyOfRange(data[sy], sx, sx+3);
		array[1] = Arrays.copyOfRange(data[sy+1], sx, sx+3);
		
		return Arrays.deepEquals(array, PattarnE);
	}
	private static boolean checkF(boolean data[][], int sy, int sx){
		if(8<=(sy+2) || 8<=(sx+1)){
			return false;
		}
		boolean array[][] = new boolean[3][2];
		array[0] = Arrays.copyOfRange(data[sy], sx, sx+2);
		array[1] = Arrays.copyOfRange(data[sy+1], sx, sx+2);
		array[2] = Arrays.copyOfRange(data[sy+2], sx, sx+2);
		
		return Arrays.deepEquals(array, PattarnF);
	}
	private static boolean checkG(boolean data[][], int sy, int sx){
		if(8<=(sy+1) || (sx-1)<0 || 8<=(sx+1)){
			return false;
		}
		boolean array[][] = new boolean[2][3];
		array[0] = Arrays.copyOfRange(data[sy], sx-1, sx+2);
		array[1] = Arrays.copyOfRange(data[sy+1], sx-1, sx+2);
		
		return Arrays.deepEquals(array, PattarnG);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean data[][] = new boolean[8][8];
		String str = new String();
		
		
		for(int i=0; i<8; ++i){
			str = scan.next();
			for(int j=0; j<8; ++j){
				data[i][j] = Integer.parseInt("" + str.charAt(j)) == 1;
			}
		}
		
		for(int i=0; i<8; ++i){
			for(int j=0; j<8; ++j){
				if(data[i][j]){
					if(checkA(data, i, j)){
						System.out.println("A");
					}else if(checkB(data, i, j)){
						System.out.println("B");
					}else if(checkC(data, i, j)){
						System.out.println("C");
					}else if(checkD(data, i, j)){
						System.out.println("D");
					}else if(checkE(data, i, j)){
						System.out.println("E");
					}else if(checkF(data, i, j)){
						System.out.println("F");
					}else if(checkG(data, i, j)){
						System.out.println("G");
					}
				}
			}
		}
	}
}