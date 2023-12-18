import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    	int b = sc.nextInt();

    	if (b == 1) {
            System.out.println(0);
    		return;
    		//1個だけなら、0返す。
        }
        int res = 1;
        int total = a;
        while (total < b) {
          //個数分ループ
          total += (a - 1);
          //繋げようタブを引き
            res += 1;
        }
        System.out.println(res);
    }

}
