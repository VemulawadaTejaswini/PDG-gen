import java.util.Scanner;

public class Main{
    
    static int[][] m = new int[1001][1001];
    
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
	    for(int a = 1; a < 1001; a++){
		for(int b = 1; b < 1001; b++){
		    m[a][b] = -1;
		}
	    }
	    X = " "+scan.next();
	    cX = X.toCharArray();
	    Y = " "+scan.next();
	    cY = Y.toCharArray();
	    i = cX.length - 1;
	    j = cY.length - 1;
	    System.out.println(lcs(cX,cY,i,j));
	}
    }
    
    static int lcs(char[] cX,char[] cY,int i,int j){
	if(m[i][j] != -1){
	    return m[i][j];
	}else if(cX[i] == cY[j]) {
	    int tmp = lcs(cX,cY,i-1,j-1)+1;
	    m[i][j] = tmp;
	    return tmp;
	}else{
	    return Math.max(lcs(cX,cY,i-1,j),lcs(cX,cY,i,j-1));
	}
    }  
}