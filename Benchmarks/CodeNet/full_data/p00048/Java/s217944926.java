import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double d = sc.nextDouble();
			if(d<=48.0)System.out.println("light fly");
			if(d>48.0 && d<=51.0)System.out.println("fly");
			if(d>51.0 && d<=54.0)System.out.println("bantam");
			if(d>54.0 && d<=57.0)System.out.println("feather");
			if(d>57.0 && d<=60.0)System.out.println("light");
			if(d>60.0 && d<=64.0)System.out.println("light welter");
			if(d>64.0 && d<=69.0)System.out.println("welter");
			if(d>69.0 && d<=75.0)System.out.println("light middle");
			if(d>75.0 && d<=81.0)System.out.println("middle");
			if(d>81.0 && d<=91.0)System.out.println("light heavy");
			if(d>91.0)System.out.println("heavy");
		}
	}
}