import java.util.Scanner;
class Main{
	
	Scanner sc = new Scanner(System.in);
	int x;
	int i;
	
	void rp2(){
		
		x = sc.nextInt();
	
		for(i=1; x!=0; i++){
			System.out.println("Case "+i+": "+x);
			x = sc.nextInt();
		}
	}
	
	public static void main(String[]agrs){
		new Main().rp2();
	}
}
	