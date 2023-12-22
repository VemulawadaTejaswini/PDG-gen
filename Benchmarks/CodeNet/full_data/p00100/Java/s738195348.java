import java.util.*;
class Sale_Result{
	Scanner sc=new Scanner(System.in);
	void main(){
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int e=sc.nextInt();
			int p=sc.nextInt();
			int q=sc.nextInt();
			int a=p*q;
			if(a>=1000000){
				System.out.println(e);
			}else{
				System.out.println("NA");
			}
		}
	}
	public static void main(String[]arg){
			new Sale_Result().main();
	}
}