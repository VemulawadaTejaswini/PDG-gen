import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		ArrayList<Integer> listA = new ArrayList<Integer>();
		
		listA.add(a);
		listA.add(b);
		listA.add(c);

		
		Collections.sort(listA);

		//最大の数から素数を探す
		int tmp =  listA.get(2) * 10 + listA.get(1);
		int ans = tmp + listA.get(0);

		System.out.println(ans);
   		sc.close();
        return ;

    }
    
}

