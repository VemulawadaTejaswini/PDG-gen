import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	double n = kbd.nextDouble();
	double max = n;
	double min = n;
	while(kbd.hasNext()){
	    n = kbd.nextDouble();
	    if(n > max) max = n;
	    if(n < min) min = n;
	}
	System.out.println(max-min);
    }
}