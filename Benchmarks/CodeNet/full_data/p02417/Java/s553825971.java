import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chcnt[] = new int[26];

        for(String str = sc.next(); ; str = sc.next()){
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++ ){
                char ch = str.charAt(i);
                if(ch <= 'z' && ch >= 'a') chcnt[ch - 97]++;
            }
            for(int i = 0; i < 26; i++){
                System.out.println((char)('a' + i) + " : " + chcnt[i]);
            }
        }
    }
}