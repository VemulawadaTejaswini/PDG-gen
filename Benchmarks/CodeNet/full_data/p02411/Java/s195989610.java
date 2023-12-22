import java.util.*;

public class Main{
	public static void main(String[] args){

		List<String> rank = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for(;;){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if((m == -1) && (f == -1) && (r == -1)){
				break;
			}
			if((m == -1) || (f == -1)){
				rank.add("F");
			}
			if((m + f) >= 80){
				rank.add("A");
			} else if((m + f) >= 65){
				rank.add("B");
			} else if((m + f) >= 50){
				rank.add("C");
			} else if(((m + f) >= 30) && (r >= 50)){
				rank.add("C");
			} else if((m + f) >= 30){
				rank.add("D");
			} else {
				rank.add("F");
			}
		}

		for(String s : rank){
			System.out.println(s);
		}
	}
}