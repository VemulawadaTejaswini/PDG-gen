import java.math.BigInteger;
import java.util.*;
public class Main {
	
	public static BigInteger cmp;
	public static int len;
	public static int P;
	public static BigInteger A,B,C;
	public static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		cmp=new BigInteger("1000000000000000000");
		while(sca.hasNext()){
			 A=sca.nextBigInteger();
			 B=sca.nextBigInteger();
			 C=sca.nextBigInteger();
			long K=sca.nextLong();
			Matrix a=new Matrix();
			 a.mat[2][1]=BigInteger.ONE;
			    a.mat[3][1]=BigInteger.ONE;
			    a.mat[1][2]=BigInteger.ONE;
			    a.mat[3][2]=BigInteger.ONE;
			    a.mat[1][3]=BigInteger.ONE;
			    a.mat[2][3]=BigInteger.ONE;
			    flag=true;
			    Matrix c=Poww(a,K);
			
			if(K==0){
				System.out.println(A.subtract(B));
			}
			else if(!flag){
				System.out.println("Unfair");
			}
			else{
				   BigInteger p1=B.multiply(c.mat[2][1]).add(C.multiply(c.mat[3][1]));
	        	   BigInteger p2=A.multiply(c.mat[1][2]).add(C.multiply(c.mat[3][2]));
	               BigInteger cc=p1.subtract(p2);
	               System.out.println(cc);
			}
		}
	}
	public static Matrix MUL(Matrix a,Matrix b){
		Matrix c=new Matrix();
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				for(int k=1;k<=3;k++){
					c.mat[i][j]=(c.mat[i][j].add(a.mat[i][k].multiply(b.mat[k][j])));
				}
			}
		}
		return c;
	}
	public static Matrix Poww(Matrix a,long b){
	    Matrix ans=new Matrix();
	    for(int i=1;i<=3;i++)ans.mat[i][i]=BigInteger.ONE;
	    while(b%2!=0){
	        if(b%2==1){
	        	ans=MUL(ans,a);
	        	   BigInteger p1=B.multiply(ans.mat[2][1]).add(C.multiply(ans.mat[3][1]));
	        	   BigInteger p2=A.multiply(ans.mat[1][2]).add(C.multiply(ans.mat[3][2]));
	               BigInteger cc=p1.subtract(p2);
	               if(cc.compareTo(BigInteger.ZERO)<0){
	            	   cc=p2.subtract(p1);
	               }
	               if(cc.compareTo(cmp)>0){
	                   flag=false;
	                   return ans;
	               }	
	        
	        
	        }
	        
	        
	        a=MUL(a, a);
	        b=b/2;
	    }
	    return ans;
	}
 
}
class Matrix{
	public  BigInteger mat[][]=new BigInteger[4][4];
	public Matrix(){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				mat[i][j]=BigInteger.ZERO;
			}
		}
	}
	
}