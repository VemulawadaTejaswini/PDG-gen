import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		List<Tmp> list = new ArrayList<Tmp>();
		for(int i = 0; i < n; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			list.add(new Tmp(a,b));
		}

		Collections.sort(list, new Comparator<Tmp>(){
	        @Override
	        public int compare(Tmp a, Tmp b){
	          return a.a - b.a;
	        }
	    });

		for(int i = 0; i < n; i++){

			k -= list.get(i).b;
			if(k <= 0){
				System.out.println(list.get(i).a);
				break;
			}
		}
	}

}

class Tmp{
	public int a;
	public int b;

	Tmp(int a,int b){
		this.a = a;
		this.b = b;
	}
}
