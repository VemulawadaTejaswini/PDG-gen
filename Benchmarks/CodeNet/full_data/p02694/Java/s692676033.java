import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
      	double rate = 1.01;
      	long money = 100;
        int ans = 0;
        while(money < X){
          money *= rate;
          ans += 1;
        }
        	System.out.println(ans);
    }
}