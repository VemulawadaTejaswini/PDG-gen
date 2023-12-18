import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();

        double L = 1 ;
        double S = 1 ;
        double C = 1 ;
        double temp = 1;
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


        List<Double> list = new ArrayList<Double>();
        double num = C;
        double i = 2;

        while (num != 1) {
        	if ( num % i == 0 ) {
        		num = num / i;
        		list.add(i);
        		}
        	 else {
        		i++;
        	}
        }

        List<Double> ans = new ArrayList<Double>(new HashSet<>(list));
        System.out.print(ans.size() + 1);
    }
}