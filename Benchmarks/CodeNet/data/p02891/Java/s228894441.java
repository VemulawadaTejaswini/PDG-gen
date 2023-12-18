import java.util.*;
public class Main {
    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        long k = sc.nextLong();


        //連続している場所を探す
        long counter = 0;
        int index = -1;
        if (s.length != 1) {//入力文字が1文字を超える場合
            char prefChar = s[0];
            for (int i = 1; i < s.length; i++) {
                if (prefChar == s[i]) { //前の文字と一緒ならば
                    do {
                        s[i] = (char) (s[i] + 1);
                    } while (s[i] == prefChar);
                    counter++;//交換した数
                }
                prefChar = s[i];
                index = -1;
            }
            //先頭と最後を比較
            if (s[0] == s[s.length-1]) {
                do {
                    s[s.length-1] = (char) (s[s.length-1] + 1);
                } while (s[s.length-2] == s[s.length] || s[0] == s[s.length-1]);
                counter++;
                counter = k * counter -1;
            } else {
                counter = k * counter;
            }
        } else {
            //入力文字が1文字の場合
            counter = k/2;
        }

        System.out.println(counter);
    }
}