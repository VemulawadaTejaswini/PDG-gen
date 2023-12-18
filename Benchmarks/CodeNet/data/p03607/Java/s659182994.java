import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList list = new ArrayList<Integer>();
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			long tmp = in.nextLong();
			if(list.contains(tmp))
				list.remove(list.indexOf(tmp));
			else
				list.add(tmp);
		}
		System.out.print(list.size());
	}
}
