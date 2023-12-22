import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String al = "abcdefghijklmnopqrstuvwxyz";
        String[] alp = al.split("");
        int cou[] = new int[26];

        while(scn.hasNextLine()) {
            String s ="";
            s = scn.nextLine();
            String[] str = s.split("");

            for (int i = 0; i < al.length(); i++) {
                 cou[i] += count(str, alp[i]);
            }

        }


        for (int i = 0; i < al.length(); i++) {
            System.out.printf("%s : %d%n",alp[i],cou[i]);
        }

        scn.close();


    }

    static int count(String[] S, String M) {
        int c = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i].equalsIgnoreCase(M)) {
                c += 1;
            }
        }
        return c;
    }


}
