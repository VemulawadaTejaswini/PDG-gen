import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 参加できるリスト
		int[] l = {111,222,333,444,555,666,777,888,999};
		// 整数の入力
        	int b = sc.nextInt();
	        for ( int i : l ) {
        	    if ( b <= i ) {
    			System.out.println(i);
	    		break;
        	    }
	        }
		}
}