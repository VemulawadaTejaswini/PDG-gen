import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNext()){
			int tra = sc.nextInt();
			if(tra == 0){
				System.out.println(list.remove(list.size()-1));
			} else {
				list.add(tra);
			}
		}
	}

}