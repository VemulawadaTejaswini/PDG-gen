import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        long L = 1 ;
        long S = 1 ;
        long C = 1 ;
        long temp = 1;
        if (a >= b) {
        	L = a;
        	S = b;
        }else {
        	L = b;
        	S = a;
        }

        while (true){
        	temp = S;
        	S = L % S;
        	L = temp;
        	if (S == 0 ) {
        		C = L;
        		break;
        	}
        }
        if (C == 1) {
        	System.out.print(1);
        	return;
        };


        List<Long> list = new ArrayList<Long>();
        long num = C;
        long i = 2;

        while (num != 1) {
        	if ( num % i == 0 ) {
        		num = num / i;
        		list.add(i);
        		}
        	 else {
        		i++;
        	}
        }

        List<Long> ans = new ArrayList<Long>(new HashSet<>(list));
        System.out.print(ans.size() + 1);
    }
}
