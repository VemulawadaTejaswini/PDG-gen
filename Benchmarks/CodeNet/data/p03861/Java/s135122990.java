import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = scn.nextDouble();
      	double x = scn.nextDouble();
      	int count = 0;
      	for(double i=a; i<=b; i++){
          if(i%x==0) count++;
        }
      	System.out.println(count);
	}
}
