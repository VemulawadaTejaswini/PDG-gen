import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int rounds = sc.nextInt();
        makeShortest(rounds,string.toCharArray());


        System.out.println(makeShortest(rounds,string.toCharArray()));


        //System.out.println(ch);
    }

    public static String makeShortest(int rounds,char [] m){
        while(rounds >0) {
            int index = 0;
            int temp = 122;
            for (int i = 0; i < m.length; i++) {
                int myChar = 122 - m[i];
                if (temp > myChar) {
                    temp = myChar;
                    index = i;
                }
            }
            if(m[index] < 122){
                int calulated = m[index] + 1;
            char change = (char) calulated;
            m[index] = change;
            } else {m[index] = 97;
            }

            rounds--;
        }
        return String.copyValueOf(m);

    }
}