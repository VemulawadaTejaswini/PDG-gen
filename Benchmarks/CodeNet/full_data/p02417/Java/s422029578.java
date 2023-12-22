import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] alphabet = new int[26];       //配列alphabet

        //入力の繰り返し
        while (scan.hasNext()) {
            String s = scan.nextLine();

            //文字列の長さ分繰り返す
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);           //文字列を１文字ずつ

                //小文字、大文字によってインデックスを算出
                if ('a'<=c && c<='z') {
                    alphabet[c-97]++;
                }else if ('A'<=c && c<='Z') {
                    alphabet[c-65]++;
                }

            }
        }

        //alphabetの出力
        for (int i=0; i<26; i++) {
            System.out.println((char)(i+97)+" : "+alphabet[i]);     //intをcharにキャストしアルファベットに変換
        }

    }
}
