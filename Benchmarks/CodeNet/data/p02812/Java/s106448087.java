import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        char[] Sc = S.toCharArray();
        int count = 0;

        for(int i=0; i < Sc.length-2; i++){
           if(Sc[i] == 'A' && Sc[i+1] == 'B' && Sc[i+2] == 'C'){
               count++;
           }
        }

        System.out.println(count);
    }
}
