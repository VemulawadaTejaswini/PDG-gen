import java.util.Scanner;

/**
 * atcoder2
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(!((S.charAt(i)+"").equals(T.charAt(i)+"")))
            count++;
        }
        System.out.println(count);
    }
    
}