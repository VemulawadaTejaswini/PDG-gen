import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
    	int m = scn.nextInt();
    	char[][] A = new char[n][n];
    	char[][] B = new char[m][m];
    	for(int i=0;i<n;i++){
      		String n = scn.next();
      		for(int j=0;j<n;j++){
        		A[i][j]=n.charAt(j);
      		}
    	}
    	for(int i=0;i<m;i++){
      		String m = scn.next();
      		for(int j=0;j<m;j++){
        		B[i][j]=m.charAt(j);
      		}
    	}
      	String ans = "No";
      	for(int i=0;i<n;i++){
      		for(int j=0;j<n;j++){
        		if(i+m>n || j+m>n){
          			break;
        		}
        	for(int k=0;k<m;k++){
          		for(int l=0;l<m;l++){
            		if(A[i+k][j+l]==B[k][l]){
              			ans = ""Yes";
              			break;
            		}
          		}
        	}
      	}
    	System.out.println(ans);
	}
}