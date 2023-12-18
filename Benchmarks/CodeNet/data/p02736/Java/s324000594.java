import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		int result = 0;
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		for(int i = 0; i < s.length()-1; i++){
		    int a = s.charAt(i) - '0';
		    int b = s.charAt(i+1) - '0';
		    if(abs(a-b) != 0) list.addLast(abs(a-b));
		}
		while(list.size() > 2){
		    int a = list.poll();
		    int b = list.poll();
		    int c = list.poll();
		    //if(a == 1 && b == 1 & c == 1) list.addFirst(0);
		    if(a == 1 && b == 1 & c == 2) list.addFirst(1);
		    //if(a == 1 && b == 2 & c == 1) list.addFirst(0);
		    if(a == 1 && b == 2 & c == 2) list.addFirst(1);
		    if(a == 2 && b == 1 & c == 1) list.addFirst(1);
		    //if(a == 2 && b == 1 & c == 2) list.addFirst(0);
		    if(a == 2 && b == 2 & c == 1) list.addFirst(1);
		    //if(a == 2 && b == 2 & c == 2) list.addFirst(0);
		}
		
		if(list.size() == 1) result = list.poll();
		if(list.size() == 2){
		    int a = list.poll();
		    int b = list.poll();
		    result = abs(a-b);
		}
		
		// 出力
		System.out.println(result);
	}
	
}
