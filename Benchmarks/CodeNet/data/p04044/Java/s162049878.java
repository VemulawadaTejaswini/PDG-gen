import java.util.*;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                try {   
                        int num = sc.nextInt();
                        int len = sc.nextInt();
                        InputStr.len = len;
                        InputStr[] inputStr = new InputStr[num];
                        for (int i = 0; i<num; i++) {
                                inputStr[i] = new InputStr(sc.next());
                        }
                        // 並べ替え
                        Arrays.sort(inputStr);
                        for (int i = 0; i<num; i++) {
                                System.out.print(inputStr[i]);
                        }
                        System.out.println();

                } catch (Exception e) {
                //      e.printStackTrace();
                        System.out.println("入力値が不正です");
                }
        }

        // 入力値をソートするためにcompareToを実装したクラス
        static class InputStr implements Comparable<InputStr> {
                static int len = 0;
                String str = "";
                InputStr(String str) {
                        this.str = str; 
                }

                @Override
                public int compareTo(InputStr nextInput) {
                        for (int i = 0; i<len; i++) {
                                // 同じ文字なら次の文字を比較する
                                if (this.str.charAt(i) == nextInput.str.charAt(i)) {
                                        continue;
                                }
                                return this.str.charAt(i) - nextInput.str.charAt(i);
                        };
                        return 0;
                }

                @Override
                public String toString() {
                        return this.str;
                }

        }
}