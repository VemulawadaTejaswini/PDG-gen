import java.util.Scanner;
public class Main{
	Scanner sc=new Scanner(System.in);
	int n,m;
	
	void a(){
		for(int i=0; i<4; i++){
			n=sc.nextInt();
			m=sc.nextInt();
		
		
			if(n==1){
				System.out.println(6000*m);
			}else if(n==2){
				System.out.println(4000*m);
			}else if(n==3){
				System.out.println(3000*m);
			}else if(n==4){
				System.out.println(2000*m);
			}
		}
	}
	
	public static void main(String[]agrs){
		new Main().a();
	}
}
		