import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = Integer.parseInt(sn.next());
        int cnt = 1000;
        for (int i = 1000; i <= 10000; i = i+1000){
          if ( n <= cnt){
            break;
          }
          cnt = cnt + 1000;
        }
        System.out.println(cnt - n);
	}
}

