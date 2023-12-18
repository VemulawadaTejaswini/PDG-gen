import java.util.*;
public class Main {
    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        long k = sc.nextLong();

        //使われていない文字を取得する
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < ('z' - 'a') + 1; i++) {
            list.add((char) ('a' + i));
        }
        //remove list
        for (char c : s) {
            while(list.indexOf(c) != -1) {
                list.remove(list.indexOf(c));
            }
        }

        //連続している場所を探す
        long counter = 0;
        int index = -1;
        int nextInx = (2 < s.length-1) ? 0 : 2;
        if (s.length != 1) {//入力文字が1文字を超える場合
            char prefChar = s[0];
            for (int i = 1; i < s.length; i++) {
                nextInx = (nextInx+1 > s.length-1) ? 0 : nextInx+1;
                if (prefChar == s[i]) { //前の文字と一緒ならば
                    do {
                        if (++index >= list.size()) {
                            index = -1;
                            break;
                        }
                        s[i] = list.get(index);
                    } while (s[i] == prefChar || s[nextInx] == s[i]);
                    counter++;//交換した数
                }
                prefChar = s[i];
                index = -1;
            }
            //先頭と最後を比較
            if (s[0] == s[s.length-1]) {
                counter = k * counter + k-1;
                s[s.length-1] = list.get(list.size()-1);
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