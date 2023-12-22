import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int counter=1;
		while(true){
			int n = s.nextInt();
			if(n==0) break;
			System.out.println("Case "+counter+": "+n);
			counter++;
		}
	}
}