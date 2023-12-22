import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int s,t,u,x,y,z,min;
		s = a + d - 50;
		t = b + d - 50;
		u = c + d - 50;
		x = a + e - 50;
		y = b + e - 50;
		z = c + e - 50;
		
		min = s;
		if(min > t){
			min = t;
		}if(min > u){
			min = u;
		}if(min > x){
			min = x;
		}if(min > y){
			min = y;
		}if(min > z){
			min = z;
		}
		
		System.out.println(min);

	}

}