import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int t=0,n=0,s=0,f=0,a=0;
	
	void e(){
		while(true){
			t=sc.nextInt();
			if(t==0)break;
			n=sc.nextInt();
		
			for(int i=0; i<n; i++){
				s=sc.nextInt();
				f=sc.nextInt();
				a+=(f-s);
			}
		
			if(a>=t){
				System.out.println("OK");
			}else{
				System.out.println(t-a);
			}
		}
	}
	public static void main(String[]agrs){
		new Main().e();
	}
}