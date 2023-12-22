import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Sale Result
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			List<Integer> l = new ArrayList<Integer>();
			while(n--!=0){
				int d = sc.nextInt();
				long p = sc.nextLong();
				long k = sc.nextLong();
				if(1000000<=p*k)l.add(d);
			}
			if(l.isEmpty())System.out.println("NA");
			else for(int i:l)System.out.println(i);
		}
	}
}