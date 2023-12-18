
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int number = sc.nextInt();
		        int[] Ball  = new int[number];

		        //HashMapを宣言
		        //map(0)は何も入っていない
		        Map<Integer, String> map = new HashMap<>();
		        for(int i = 0; i <= number; i++) {
		        	map.put(i,sc.nextLine());
		        }
		        for (Map.Entry<Integer, String> entry : map.entrySet()) {
		        	System.out.println(entry.getValue());
		        }

		        //for(int i = 0; i < number; i++) {
		        //	Ball[i] = sc.nextInt();
		        //}

		        //一つボールを抜いた時残りのボールの番号が一緒のが何通りあるか

		        //for(int num =0; num < number; num++) {

		        //}

	}
		}
