import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(Character.isUpperCase(a)){
			System.out.println("A");
		}else{
			System.out.println("a");
		}
	}
}
