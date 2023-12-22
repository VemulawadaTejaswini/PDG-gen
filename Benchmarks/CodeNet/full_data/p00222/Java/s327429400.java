package springstudy;
import java.util.*;
class Main {
	static final int max=100000;
	public static void main(String[] args) {
		//*ここから
		boolean prime[] = new boolean[max+1];
		for(int i=0;i<max;i++)prime[i]=true;
		prime[1]=false;
		for(int i=2;i<max;i++){
			if(prime[i]){
				for(int s=i*2;s<=max;s+=i)prime[s]=false;
			}
		}
		//*//ここまでエラトステネスの篩
		Scanner n = new Scanner(System.in);
		while(true){
			int in = n.nextInt();
			if(in==0)break;
			for(int i=in;i>0;i--){
	            if(prime[i]==true&&prime[i-8]==true&&prime[i-6]==true&&prime[i-2]){
	            	System.out.println(i);
	                break;
	            }
	        }

		}
	}
}