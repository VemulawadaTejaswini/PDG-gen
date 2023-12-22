import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		if(n==1){
			System.out.println(0);
			return;
		}
		long val = n;
		long count=0;
		for(long i=2;i*i<=val;i++){
			//int j=1;
			long val2=i;
			while(n%val2==0 && n>0){
				n/=val2;
				val2*=i;
				count++;
				
			}
		}
		count+=n!=0?1:0;
		System.out.println(count);

	}

}