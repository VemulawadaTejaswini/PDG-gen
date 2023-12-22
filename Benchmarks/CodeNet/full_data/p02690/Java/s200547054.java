import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		for(int i=0; i<=1000; i++){
			for(int j=-1000; j<=1000; j++){
				if(pow(i,5)-pow(j,5)==x){
					System.out.println(i+" "+j);
					return;
				}
			}
		}
	}
	static long pow(long left,long right){
		long ans=1;
		while(right>0){
			if((right&1)==1){
				ans*=left;
			}
			right>>=1;
			left*=left;
		}
		return ans;
	}
}