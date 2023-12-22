import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		while(sc.hasNext()){
			int car = sc.nextInt();
			if(car==0)System.out.println(s.pop());
			else s.push(car);
		}
	}
}