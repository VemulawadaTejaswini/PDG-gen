import static java.lang.System.out;
import java.lang.IllegalArgumentException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().toLowerCase().split("");
        String[] charas = "abcdefghijklmnopqlstuvwxyz".split("");
        int[] nums = new int[26];
        int count = 0;

        for(String chara : charas) {
            for(String str : strs) {                                   
                if (str.equals(chara)) {
                    nums[count]++;
                }
            }
            count++;
        }
        count = 0;
        for(String chara : charas) {
            out.printf("%s : %d\n", chara, nums[count]);
            count++;
        }
    }   
}