    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int a = sc.nextInt();
    		// スペース区切りの整数の入力
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    	    if((a+b)<c||(a>(b+c))) {
    		  System.out.println("NO");
    	    }else {
    	      System.out.println("YES");
    	    }
    	}
    }