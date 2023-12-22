import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	String X = "";
	String Y = "";
	
	for(int i = 0; i < n; i++){
	    X[i] = " "+scan.next();
	    Y[i] = " "+scan.next();
	    System.out.println(lcs(X,Y));
	}
	
    }

    public static int lcs(String X,String Y){
	char[] cX = X.toCharArray();
	char[] cY = Y.toCharArray();
	int Xl = cX.length;
	int Yl = cY.length;
	int maxl = 0;
	int[][] m = new int[Xl][Yl];

	for(int i = 0; i < Xl; i++){m[i][0] = 0;}
	for(int i = 0; i < Yl; i++){m[0][i] = 0;}

	for(int i = 1; i < Xl; i++){
	    for(int j = 1; j < Yl; j++){
		if(cX[i] == cY[j]){
		    m[i][j] = m[i-1][j-1]+1;
		}else{
		    m[i][j] = Math.max(m[i-1][j],m[i][j-1]);
		}
		maxl = Math.max(maxl,m[i][j]);
	    }
	}
	return maxl;
    }
}