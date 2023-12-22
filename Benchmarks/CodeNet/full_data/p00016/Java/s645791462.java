
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		walker walk = new walker();
		while(true){
			int go,angle;
			String input[] = in.next().split(",");
			go=Integer.parseInt(input[0]);
			angle=Integer.parseInt(input[1]);
			if(go+angle==0)break;
			walk.fd(go);
			walk.turn(angle);
		}
		System.out.printf("%.0f\n", walk.x);
		System.out.printf("%.0f\n", walk.y);
	}

}
class walker{
	static double x,y;
	static int angle;
	walker(){
		x=0;y=0;angle=0;
	}
	static void turn(int s){
		angle+=s;
	}
	static void fd(int go){
		x +=Math.sin(Math.PI*angle/180.0)*go;
		y +=Math.cos(Math.PI*angle/180.0)*go;
	}
}