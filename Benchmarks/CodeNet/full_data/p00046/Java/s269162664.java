import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 
class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedList<Double> d = new LinkedList<Double>();
		while(sc.hasNextDouble()){
			d.add(sc.nextDouble());
		}
		Collections.sort(d);
		System.out.println(d.get(d.size()-1)-d.get(0));
	}
}