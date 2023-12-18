import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int L = 1 ;
        int S = 1 ;
        int C = 1 ;
        int temp = 1;
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


        List<Integer> list = new ArrayList<Integer>();
        int num = C;
        int i = 2;

        while (i <= C ) {
        	if ( num % i == 0 ) {
        		num = num / i;
        		list.add(i);
        		if( num == 1) {
        			break;
        		}
        	}else {
        		i++;
        	}
        }

        List<Integer> ans = new ArrayList<Integer>(new HashSet<>(list));
        System.out.print(ans.size() + 1);
    }
}