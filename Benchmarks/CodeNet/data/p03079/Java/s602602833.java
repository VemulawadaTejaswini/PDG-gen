import java.util.Scanner;

class Solution{
    public static boolean isEquilateralTriangle(int a, int b, int c){
	boolean isEqTri = true;

	//if((a + b <= c) || (b + c <= a) || (a + c <= b))
	//  isTri = false;

	if(a != b || b != c)
	    isEqTri = false;

	return isEqTri;
    }
	
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);

	int side_A = stdin.nextInt();
	int side_B = stdin.nextInt();
	int side_C = stdin.nextInt();

	if(isEquilateralTriangle(side_A, side_B, side_C)){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}	
