package spring21;
import java.util.*;
public class ABC056_A {
	public static void main(String[] args){	
		Scanner sc=new Scanner(System.in);
		if(sc.next().equals("H")&&sc.next().equals("H"))System.out.println("H");
		if(sc.next().equals("H")&&sc.next().equals("D"))System.out.println("D");
		if(sc.next().equals("D")&&sc.next().equals("H"))System.out.println("D");
		if(sc.next().equals("D")&&sc.next().equals("D"))System.out.println("H");
	}
}