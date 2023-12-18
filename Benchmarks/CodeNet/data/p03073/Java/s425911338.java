import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String s = kbd.next();
        String[] tail = s.split("");

        if (blackFirst(tail) >= whiteFirst(tail)) {
            System.out.println(whiteFirst(tail));
        } else {
            System.out.println(blackFirst(tail));
        }
    }

    static int blackFirst(String[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int coun = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i].equals("0")) {
                    continue;
                } else {
                    coun++;
                }
            } else {
                if (arr[i].equals("1")) {
                    continue;
                } else {
                    coun++;
                }
            }
        }
        return coun;
    }

    static int whiteFirst(String[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int coun = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i].equals("1")) {
                    continue;
                } else {
                    coun++;
                }
            } else {
                if (arr[i].equals("0")) {
                    continue;
                } else {
                    coun++;
                }
            }
        }
        return coun;
    }
}