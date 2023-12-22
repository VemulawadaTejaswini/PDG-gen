import java.util.Scanner;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in).useDelimiter("[ \t\n,]");
	double x = 0;
	double y = 0;
	int theta = 90;
	while(true){
	    int d = stdin.nextInt();
	    int dtheta = stdin.nextInt();
	    if(d == 0 && dtheta == 0)  break;
	    x += d * Math.cos(theta * Math.PI / 180);
	    y += d * Math.sin(theta * Math.PI / 180);
	    theta -= dtheta;
	    System.out.println(x + "," + y);
	}
	System.out.println((int)(x));
       	System.out.println((int)(y));
	
    }
}