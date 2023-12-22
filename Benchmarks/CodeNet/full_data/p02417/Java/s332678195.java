import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counter = new int[26];
        for(int i = 0; i < 26; i++){
            counter[i] = 0;
        }

        String s = sc.nextLine().toLowerCase();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >=97 && s.charAt(i) <= 122) {
                counter[s.charAt(i) - 97]++;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.println((char)(i + 97) + " : " + counter[i]);
        }
        sc.close();
    }
}
