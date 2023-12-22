import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String strT = in.nextLine();
        String strP = in.nextLine();

        NativeStringSearch.search(strT, strP);
    }
}

class NativeStringSearch {
    static void search(String strT, String strP) {
        for (int i = 0; i < strT.length() - strP.length()+1; i++) {
            if (strT.substring(i, i + strP.length()).equals(strP)) {
                System.out.println(i);
            }
        }
    }
}

