
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		HashSet<String> set = new HashSet<>();
		int red = 0;
		for(int i= 0; i<N; i++){
			int a = Integer.parseInt(sc.next());
			if(a<400){
				set.add("gray");
			}
			else if(a<800){
				set.add("brown");
			}
			else if(a<1200){
				set.add("g");
			}
			else if(a<1600){
				set.add("a");
			}
			else if(a<2000){
				set.add("b");
			}
			else if(a<2400){
				set.add("y");
			}
			else if(a<2800){
				set.add("o");
			}
			else if(a<3200){
				set.add("red");
			}
			else{
				red++;
			}
		}
		int min = Math.max(set.size(),1);
		int max = min + red;
		if(set.size() == 0){
			max = red;
		}
		out.println(min + " " + max);
		
		sc.close();
		out.flush();
	}
}