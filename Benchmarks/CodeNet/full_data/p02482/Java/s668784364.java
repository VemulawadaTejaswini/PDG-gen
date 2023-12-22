import java.util.*;

public class Main{
    public static void main(String[] args){
	int x, y;
	Scanner sc = new Scanner(System.in);
	x = sc.nextInt();
	y = sc.nextInt();
	if(x>y)
	    System.out.println(x + " > " + y);
	else if(x<y)
	    System.out.println(x + " < " + y);
	else
	    System.out.println(x+ " == " + y);
    }
}