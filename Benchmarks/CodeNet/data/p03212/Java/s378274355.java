import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int a = sc.nextInt();

	// 出力
	int count = 0;
	int x = 333;

	for (x = 333; x <= a; x = next753(x)){
	    if (is753(x)){
		count ++;
	    }
	}
	
	System.out.println(count);
    }

    private static int next753(int n){
	return next753_1(n, 0);
    }

    private static int next753_1(int n, int k){
    	int x = n;
    	int y = n;
	int z = 1;
    	for (int i = 1; i <= k; i++){
    	    y /= 10;
	    z *= 10;
    	}

    	if(y % 10 == 0){
    	    x += 3 * z;
    	}else if(y % 10 == 3){
    	    x += (5-3) * z;
    	}else if (y % 10 == 5){
    	    x += (7-5) * z;
    	}else{
    	    x += (3-7) * z;
    	    return next753_1(x, k +1);
    	}
    	return x;
    }

    private static boolean is753(int n){
	boolean has3 = false;
	boolean has5 = false;
	boolean has7 = false;
	for(int x = n; x > 0; x /= 10){
	    if(x % 10 == 3){
		has3 = true;
	    }else if(x % 10 == 5){
		has5 = true;
	    }else if(x % 10 == 7){
		has7 = true;
	    }
	    if(has3 && has5 && has7){
		return true;
	    }
	}
	return false;
    }
}
