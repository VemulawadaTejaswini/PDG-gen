import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int count = (x/11)*2;
		if((x%11)<=6){count++;}
			else{count+=2;}
		System.out.println(count);
	}
}