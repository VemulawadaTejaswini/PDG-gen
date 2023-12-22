import java.util.Scanner;
class Main{
	
	Scanner sc = new Scanner(System.in);
	int x;
	int y;
	
	void rp3(){
	
		x = sc.nextInt();
		y = sc.nextInt();
		
	
		for(int i=1; (x>0 || y>0); i++){
			if(x>y){
				System.out.println(y+" "+x);
			}else{
				System.out.println(x+" "+y);
			}
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
	}
	
	public static void main(String[]agrs){
			new Main().rp3();
	}
}
	