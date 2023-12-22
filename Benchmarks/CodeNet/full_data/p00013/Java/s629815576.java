import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		int size;
		while(scan.hasNext()){
			int in = scan.nextInt();
			size = list.size();
			if(in == 0){
				list.remove(size - 1);
			}
			list.add(in);
		}
		for(int i = size - 1; i >= 0; i++){
			System.out.printf("%d\n", list.get(i));
		}
	}
}