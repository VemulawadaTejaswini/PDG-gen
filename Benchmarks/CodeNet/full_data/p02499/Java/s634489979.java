import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        for (int i = 0; i < 26; i++) count[i] = 0;
        String str;
        while(sc.hasNext()){
            str = sc.nextLine().toLowerCase();
            for (int i = 0; i < str.length(); i++){
                if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                    count[str.charAt(i) - 'a']++;
                }
            }
        }
        for(int i = 0; i < 26; i++) System.out.printf("%c : %d\n", 'a' + i, count[i]);
    }
}