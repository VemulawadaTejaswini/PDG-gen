import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int x;
	int i=1;
	void a(){
		while(true){
		x=sc.nextInt();
		if(x==0)break;
		
		System.out.println("Case "+i+": "+x);
		i++;
		
		}
	}
	
	public static void main(String[]agrs){
		new Main().a();
	}
}