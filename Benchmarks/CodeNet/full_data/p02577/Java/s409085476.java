import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine(); 
		
		String[] str=n.split("");
		
		int result=0;
		
		for(String value:str) {
			int num=Integer.parseInt(value);
			result=result+num;
		}
		
		if(result%9==0) {
			System.out.println(("Yes"));
		}else {
			System.out.println("No");
		}
	
	}

}
