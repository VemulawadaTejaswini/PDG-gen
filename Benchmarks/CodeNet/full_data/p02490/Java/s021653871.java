import java.util.Scanner;

class Main {
	public static void main(String[] args){
		int x,y;
		Scanner sc = new Scanner(System.in);
		while(true){
			x=sc.nextInt();
			y=sc.nextInt();
			if(x == 0 && y==0)break;
			if(x < y){
				System.out.println(y+" "+x);
			}else{
				System.out.println(x+" "+y);
			}
		}
	}
}