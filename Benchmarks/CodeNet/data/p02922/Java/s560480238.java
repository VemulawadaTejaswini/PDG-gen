import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                // 整数の入力
                int tapinput = sc.nextInt();
                int target = sc.nextInt();
                int result = 1;

                if (target > tapinput) {
                        int loopcount = tapinput - 1;
                        int checkcount = 0 + tapinput;
                        for (int i = 1; i < 21; i++) {
                                checkcount += loopcount;
                                if (target <= checkcount) {
                                        result += i;
                                        break;
                                }
                        }
                } else if ( target == 1 ) {
                        result = 0;
                }

                // 出力
                System.out.println(result);
        }
}