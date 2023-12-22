import java.util.Scanner;
public class Main{
	static Scanner sc;
	static int L,M,N,T,month;
	
	public static void main(String[]args){
		sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			L=sc.nextInt();
			month=0;
			T=0;
			for(int i=0;i<12;i++){
				M=sc.nextInt();
				N=sc.nextInt();
				T=T+M-N;
				if(T>=L && month==0){
					month=i+1;
				}
			}
			if(month==0)System.out.println("NA");
			else{System.out.println(month);}
		}
	}
}