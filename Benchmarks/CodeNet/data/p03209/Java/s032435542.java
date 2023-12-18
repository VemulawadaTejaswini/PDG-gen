import java.util.*;
 
public class Main {
	
  	static long[] all_patty = new long[51];
    static long[] burger_size = new long[51];

    static long calc_burger_size(int level) {
        if (level == 0)
            return 1;
        if (burger_size[level] != 0)
            return burger_size[level];

        return burger_size[level] = 3 + 2 * calc_burger_size(level - 1);
    }

    static long calc_all_patty(int level) {
        if (level == 0)
            return 1;
        if (all_patty[level] != 0)
            return all_patty[level];

        return all_patty[level] = 1 + 2 * calc_all_patty(level - 1);
    }

    static long eat_patty(int level, long X) {
        if (level == 0) {
            return Math.min((long)X, 1L);
        }

        long result = 0L;
        long this_burger_size = calc_burger_size(level);

        if(X >= this_burger_size - 1){
            result =  calc_all_patty(level);
        }else if(X > this_burger_size / 2){
            result =  calc_all_patty(level - 1) + 1 + eat_patty(level - 1, X - this_burger_size / 2 - 1);
        }else if(X > 1L){
            result = eat_patty(level - 1, X - 1);
        }else{
            result = 0L;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long X = Long.parseLong(sc.next());
        sc.close();

        all_patty[0] = 1L;
        burger_size[0] = 1L;
        System.out.println(eat_patty(N, X));
    }
}