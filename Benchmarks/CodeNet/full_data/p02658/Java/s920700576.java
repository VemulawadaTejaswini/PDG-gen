import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		long aa=1L;
		for(int i=0;i<n;i++){
			long a=sc.nextLong();
			if(Math.log10(a)+Math.log10(aa)>18||
			aa*a>1000000000000000000L){
			   //1000000000000000000L
				aa=-1;
			}
			else if(a==0){
				aa*=0;
			}
			else if(aa!=-1){
				aa*=a;
			}
		}
		System.out.println(aa);
	}
}

