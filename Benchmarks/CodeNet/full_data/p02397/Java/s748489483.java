import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> listX = new ArrayList<Integer>();
		List<Integer> listY = new ArrayList<Integer>();
		for(;;){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if((x == 0) && (y == 0)){
				break;
			}
			if(x > y){
				int work = x;
				x = y;
				y = work;
			}
			listX.add(x);
			listY.add(y);
		}

		for(int i = 0; i < listX.size(); i++){
			System.out.printf("%d %d\n", listX.get(i), listY.get(i));
		}
	}
}