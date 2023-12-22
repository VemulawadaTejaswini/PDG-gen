import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x,y,z;
		x=cin.nextInt();
		y=cin.nextInt();
		z=cin.nextInt();
		if(x>y && y>z){
			System.out.println(x+" "+y+" "+z);
		}else if(x<=y && y<=z){
			System.out.println(z+" "+y+" "+x);
		}else if(y>=x && x>=z){
			System.out.println(y+" "+x+" "+z);
		}else if(x>z && z>y){
			System.out.println(x+" "+z+" "+y);
		}else if(y>=z && z>=x){
			System.out.println(y+" "+z+" "+x);
		}else if(z>x && x>y){
			System.out.println(z+" "+x+" "+y);
		}

	}

}