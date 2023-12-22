import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Long max = 1000000000000001L;
        Long a = sc.nextLong();

        String[] list = {"z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                          "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                          "w", "x", "y"};

        boolean flg = true;

        long temp = 0;
        List<String> ans = new ArrayList<>();

        while(flg) {
            temp = a / 26;
            int index = (int) (a % 26);
            ans.add(list[index]);
            if (temp > 0) {
                a = temp;
            } else {
                flg = false;
            }
        }
        String answer = "";
        for (int i = ans.size(); i > 0; i--) {
        	answer += ans.get(i-1);
        }
//        Arrays.sort(ans, Comparator.reverseOrder());
        System.out.println(answer);
    }
}