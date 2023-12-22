import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	String X = "";
	String Y = "";
	char[] cX = new char[1001];
	char[] cY = new char[1001];
	int i = 0;
	int j = 0; 
 
	for(int k = 0; k < cX.length; k++) m[i][0] = 0;
	for(int k = 0; k < cY.length; k++) m[0][i] = 0;
	
	for(int k = 0; k < n; k++){
	    X = " "+scan.next();
	    cX = X.toCharArray();
	    Y = " "+scan.next();
	    cY = Y.toCharArray();
	    i = cX.length - 1;
	    j = cY.length - 1;
	    System.out.println(lcs(cX,cY,i,j));
	}
    }
    
    static int[][] m = new int[1001][1001];
    static int lcs(char[] cX,char[] cY,int i,int j){
	if(i == 0 || j == 0) {return 0;} 
	else if(cX[i] == cY[j]) {return lcs(cX,cY,i-1,j-1)+1;}
	else {return Math.max(lcs(cX,cY,i-1,j),lcs(cX,cY,i,j-1));}	    
    }
}