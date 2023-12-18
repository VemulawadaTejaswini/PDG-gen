import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ar = sc.nextLine();

        int cnt = 0;

        for(int i = 0 ; i < ar.length()-1 ; i++) {

            for(int j = i ; j <= ar.length() ; j++) {
                String str =ar.substring(i, j);
                if(str.matches("([ATCG])+")) {
                    if(cnt<str.length()) {
                        cnt = str.length();
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}