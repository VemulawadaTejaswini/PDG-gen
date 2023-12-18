import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idk = sc.nextInt();

        sc.nextLine();

        String S = sc.nextLine();

        for(int i = 0; i < idk; i+=0) {
            if(S.length()==1)
              break;
            char currentChar = S.charAt(i);
            char nextChar = S.charAt(i+1);
            boolean same = (currentChar == nextChar);
            if(same) {
              S = S.substring(0, i) + S.substring(i+1);
            } else {
                i++;
            }
        }

        System.out.println(S.length());
    }
}