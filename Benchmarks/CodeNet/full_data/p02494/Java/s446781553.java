
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
			for(long i = ary[0];i > 0;i--){
				for(long j = ary[1];j > 0;j--){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}