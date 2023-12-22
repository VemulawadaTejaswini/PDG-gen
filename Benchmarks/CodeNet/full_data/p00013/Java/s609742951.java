import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> ad= new ArrayDeque<Integer>();
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			if(n==0){
				System.out.println(ad.pop());

			}else{
				ad.push(n);
			}
		}
	}

}