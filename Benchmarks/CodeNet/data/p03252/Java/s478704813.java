import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int textLength = S.length();

        String notDuplicateS = "";
        for (int i = 0; i < S.length(); i++) {
            if (!notDuplicateS.contains(S.substring(i, i+1))) {
                notDuplicateS = notDuplicateS.concat(S.substring(i, i+1));
            }
        }
        String notDuplicateT = "";
        for (int i = 0; i < T.length(); i++) {
            if (!notDuplicateT.contains(T.substring(i, i+1))) {
                notDuplicateT = notDuplicateT.concat(T.substring(i, i+1));
            }
        }

        if (notDuplicateS.length() == notDuplicateT.length()) {
            for (int i = 0; i < notDuplicateS.length(); i++) {
                if (notDuplicateS.charAt(i) != notDuplicateT.charAt(i)) {
                    char replaceS = notDuplicateS.charAt(i);
                    char replaceT = notDuplicateT.charAt(i);
                    notDuplicateS = notDuplicateS.replace(replaceS, '0');
                    notDuplicateS = notDuplicateS.replace(replaceT, replaceS);
                    notDuplicateS = notDuplicateS.replace('0', replaceT);
                }
            }
            if (notDuplicateS.equals(notDuplicateT)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}