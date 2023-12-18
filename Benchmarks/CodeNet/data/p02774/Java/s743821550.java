import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Long> input_list = new ArrayList();
		int n = sc.nextInt();
		int k = sc.nextInt();
		for( int i=0; i<n; i++) {
		    Long number = sc.nextLong();
		    input_list.add(number);
		}
		List<Long> list = new ArrayList();
        for(int a = 0; a < n-1; a++) {
            for( int b = a +1; b < n; b++) {
                list.add(input_list.get(a) * input_list.get(b));
            }
        }
		Collections.sort(list);
//		for (int i=0; i<list.size(); i++) {
//		    System.out.println(list.get(i));
//		}
        System.out.println("" + list.get(k-1));
	}
}