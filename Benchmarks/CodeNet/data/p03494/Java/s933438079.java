import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=Integer.valueOf(scan.nextLine());
		int[] input = Stream.of(scan.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		int result=-1;
		boolean isCont=true;
		while(isCont) {
			result++;
			for(int i=0;i<count;i++) {
				if(input[i]%2==1) {
					isCont=false;
					break;
				}
				input[i]=input[i]/2;
			}
		}
		System.out.println(result);
		scan.close();
	}
}