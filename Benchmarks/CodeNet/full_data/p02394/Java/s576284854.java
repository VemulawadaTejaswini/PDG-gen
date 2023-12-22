import java.util.Scanner;
public class Main {
	void cinr(){
		int w,h,x,y,r;
		Scanner s = new Scanner(System.in);
		w = s.nextInt();
		h = s.nextInt();
		x = s.nextInt();
		y = s.nextInt();
		r = s.nextInt();
		if(x-r<0||y-r<0||x+r>w||y+r>h){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}


	}
	public static void main(String args[]){
		Main m = new Main();
		m.cinr();
	}
}