import java.util.*;
 
public class Main{
    public static void main(String[] args){
        double r,s,c;
	Scanner sc = new Scanner(System.in);

	r = sc.nextDouble();
	s = r*r*(Math.PI);
	c = 2*r*(Math.PI);

	System.out.println(s + " " + c);
    }
}