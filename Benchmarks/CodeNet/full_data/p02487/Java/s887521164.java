
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	private static class List extends LinkedList<long[]> {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		while (true) {
			long h = sc.nextLong();
			long w = sc.nextLong();
			if(h == 0L && w == 0L){
				break;
			}
			list.add(new long[]{h,w});
		}
		for(long[] ary:list){
			for(int i = 0;i < ary[0];i++){
				for(int j = 0;j < ary[1];j++){
					if(j == 0 || j == ary[1]-1 || i == 0 || i == ary[0]-1){
						System.out.print("#");
					}else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}