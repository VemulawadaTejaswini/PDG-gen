import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] candidate = {"AKIHABARA",
                                              "AKIHABAR",
                                              "AKIHABRA",
                                              "AKIHABR",
                                              "AKIHBARA",
                                              "AKIHBAR",
                                              "AKIHBRA",
                                              "AKIHBR",
                                              "KIHABARA",
                                              "KIHABAR",
                                              "KIHABRA",
                                              "KIHABR",
                                              "KIHBARA",
                                              "KIHBAR",
                                              "KIHBRA",
                                              "KIHBR",};
        for (int i = 0 ; i < 16 ; i++) {
            if (s.equals(candidate[i])) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}