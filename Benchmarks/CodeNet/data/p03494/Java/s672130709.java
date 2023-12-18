import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		Main main = new Main();

		int min = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 0; i < len; i++) {
			ans = main.factoring(line[i]);
			if (ans < min) {
				min =ans;
			}
		}
		System.out.println(min);

	}

	public int factoring(int num) {
      int combNum = num;
      int con = 0;

      while (true) {
        int factor = 0;

        //入力された値が素数であるか調べる
        int numsPiv = (int)Math.sqrt(combNum); //√N = numsPiv とする

        //合成数であれば約数をはじき出す
        for (int i = 2; i <= numsPiv; i++) {
          if (combNum % i == 0) {
            factor = i;
            break;

          }
        }
        if (factor == 2 || combNum == 2) {
          con++;
        }
        //入力値自身が素数になればbreak
        if (factor == 0) {
          break;

        }else {
          //はじき出した値で入力値を割って更新
          combNum = combNum / factor;
        }
      }
      return con;
	}



}