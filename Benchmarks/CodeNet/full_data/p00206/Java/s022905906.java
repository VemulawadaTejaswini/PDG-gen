import java.util.Scanner;
class Main{
	static Scanner sc;
	static int L,M,N,T,mth;
	
	public static void main(String[]args){
		sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			L=sc.nextInt();
			mth=0;
			T=0;M=0;N=0;
			for(int i=0;i<12;i++){
				M=sc.nextInt();
				N=sc.nextInt();
				T=T+M-N;
				if(T>=L && mth==0){
					mth=i+1;
				}
			}
			if(mth==0){System.out.println("NA");}
			else{System.out.println(mth);}
		}
	}
}