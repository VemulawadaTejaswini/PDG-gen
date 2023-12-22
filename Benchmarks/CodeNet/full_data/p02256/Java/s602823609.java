import java.util.Scanner;
	class Uc{
		int r,x,y;
		Uc(int X,int Y){
			x=X;y=Y;
		}
		void swap(){
			r=x;x=y;y=r;
		}
		void gcd(){
			r=x;
			x=y;
			y=r%y;
		}
	}
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Uc u=new Uc(sc.nextInt(),sc.nextInt());;
		if(u.x<u.y) {
			u.swap();
		}
		while(u.y>0) {
			u.gcd();
		}
		System.out.println(u.x);
		sc.close();
	}
}

