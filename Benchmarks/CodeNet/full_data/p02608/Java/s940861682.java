import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Integer[] a = new Integer[n];
		int cnt6 = 1, cnt17 = 1, cnt11 = 1;
		for(int i=1; i<=n; i++){
			if(i == 6 * cnt6 * cnt6){
				cnt6++;
				System.out.println(1);
			}else if(i == 17 * cnt17 + 6 * (cnt17 - 2) || i == 17){
				cnt17++;
				System.out.println(3);
			}else if(i == 11 + cnt11 * 7 + (cnt11 - 1) * 2){
				cnt11++;
				System.out.println(3);
			}else{
				System.out.println(0);
			}
		}
	}
}
