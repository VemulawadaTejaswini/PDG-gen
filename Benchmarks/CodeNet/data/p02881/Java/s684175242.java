import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		long max = 0;
		
        if(isPrimeNumber(a) || a == 1) {
            System.out.println(a -1);
        } else {
            List<Long> dvlist = divisor(a);
            
            
            for(int i = 0; i < dvlist.size(); i += 2){
                if(dvlist.size() % 2 == 1) {
                    max = (long)Math.sqrt(a);
                    max = max * 2;
                    break;
                }
                
                long sum = dvlist.get(i) + dvlist.get(i + 1);
                if(max < sum) {
                    max = sum;
                }
            }
        
            System.out.println(max - 2);
        }
        

	}

    
    
    
public static boolean isPrimeNumber(long num) {
    if (num < 2) {
        return false; // 2未満は素数でない
    }
    if (num == 2) {
        return true;  // 2は素数
    }
    if (num % 2 == 0) {
        return false; // 2以外の偶数は素数でない
    }
    double sqrtNum = Math.sqrt(num);
    for (long i = 3; i <= sqrtNum; i+=2) {
        if(num % i == 0) {
            return false;   // 割り切れたら素数でない
        }
    }
    return true; // 割り切れなかったら素数
}


public static List<Long> divisor(long n) {
    List<Long> list = new ArrayList<Long>();

    for (long i = 1; i * i <= n; i++) {    //√n
        if (n % i == 0) {
            list.add(i);          //a x b
            if (i != n / i) {
                list.add(n / i);  //b x a (逆向き)
            }
        }
    }
    return list;
}


}


