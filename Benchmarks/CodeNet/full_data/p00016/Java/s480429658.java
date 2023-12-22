import java.util.*;

public class Main2{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	double x = 0.0;
	double y = 0.0;
	double angle = 0.0;

	while(sc.hasNext()){
	    String[] line = (sc.next()).split(",");
	    int step = Integer.parseInt(line[0]);
	    int dir = Integer.parseInt(line[1]);
	    if(step==0 && dir==0)break;
	    x += (double)step * Math.sin(Math.toRadians(angle));
	    y += (double)step * Math.cos(Math.toRadians(angle));
	    angle += (double)dir;
	}

	System.out.println((int)x);
	System.out.println((int)y);
    }
}