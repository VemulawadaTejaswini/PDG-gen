import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] cnt = new int[26];

        while (input.hasNext()){
            String s = input.nextLine();

            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);

                if ('A' <= c && c <= 'Z') cnt[c - 'A']++;
                if ('a' <= c && c <= 'z') cnt[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++){
            System.out.printf("%c : %d\n", 'a' + i, cnt[i]);
        }
    }
}