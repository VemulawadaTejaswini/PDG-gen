import java.util.*;
import java.io.*;

public class Main {
    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }
    public static void printMatrix(int N, long[][] matrix){
        for(int i=0;i<N;i++){
        	for(int j=0;j<N;j++){
        	    System.out.print(matrix[i][j]);
        	    if(j>=N-1) System.out.println();
        	    else System.out.print(" ");
        	}
        }
    }
    public static long getMatrix(long[][] matrix, int i, int j){
        try{
        	return matrix[i][j];
        }
        catch(Exception e){
        	return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==2){
        	System.out.println("4 7");
        	System.out.println("23 10");
        	System.exit(0);
        }
        long[][] matrix = new long[N][N];
        long m = 1;
        
        HashSet<Long> used = new HashSet<>();
        long cur = 2;
        for(int i=0;i<N;i+=2) for(int j=0;j<N;j++){
        	if((i+j)%2==0){
        	    matrix[i][j] = cur;
        	    used.add(cur);
        	    cur++;
        	}
        }
        for(int i=N/2*2-1;i>=0;i-=2) for(int j=N-1;j>=0;j--){
        	if((i+j)%2==0){
        	    matrix[i][j] = cur;
        	    used.add(cur);
        	    cur++;
        	}
        }
        
        for(int i=0;i<N;i++) for(int j=0;j<N;j++){
        	if((i+j)%2!=0){
        	    long ans = lcm(getMatrix(matrix,i-1,j),getMatrix(matrix,i+1,j));
        	    ans = lcm(ans,getMatrix(matrix,i,j-1));
        	    ans = lcm(ans,getMatrix(matrix,i,j+1));
        	    long elm = ans+m;
        	    while(true){
        	        if(!used.contains(ans+m)){
        	        	matrix[i][j]=elm;
        	        	used.add(elm);
        	        	break;
        	        }else{
        	        	elm += ans;
        	        }
        	    }
        	}
        }
        printMatrix(N,matrix);
    }
}