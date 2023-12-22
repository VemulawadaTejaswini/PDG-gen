import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	int N;
    	int ans, sum, leng_seq;
    	while( (N= sc.nextInt())>0  ){
    		ans= 0;
    		for(leng_seq=2, sum=1+2; sum<= N; leng_seq++, sum+=leng_seq){
    			if( (N-sum)%leng_seq==0 ){ ans++; }
    		}
    		System.out.println(ans);
    	}
    }
}