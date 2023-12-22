import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count[] = new int[26];
        for (int i = 0; i < 26; i++){count[i] = 0;}
        String str = new String();
        while(true){
            str = sc.nextLine().toLowerCase();
            System.out.println(str);
            boolean leave = false;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) - 'a' >= 0 && 'z' - str.charAt(i) >= 0){
                    count[str.charAt(i) - 'a']++;
                }
                else if (str.charAt(i) == '.'){
                    leave = true;
                    break;
                }
            }
            if (leave) break;
        }
        for (int i = 0; i < 26; i++){
            System.out.printf("%c : %d\n", 'a' + i, count[i]);
        }
    }
}