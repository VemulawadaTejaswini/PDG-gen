import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    double r, s;
    double x, y;

    Scanner sc = new Scanner(System.in);
    void run(){
	x=0;
	y=0;
	String[] st = sc.next().split(",");
	r = Double.parseDouble(st[0]);
	s = 90;
	while(r!=0){
	    x += r*Math.cos(Math.toRadians(s));
	    y += r*Math.sin(Math.toRadians(s));
	    s -= Double.parseDouble(st[1]);
	    st = sc.next().split(",");
	    r = Double.parseDouble(st[0]);
	    //System.out.println(x+" "+y);
	}
	System.out.printf("%d\n%d\n", (int)x, (int)y);
    }
}