import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] strArr = str.toCharArray();

        String ret = "yes";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (i != j && strArr[i] == strArr[j]) {
                    ret = "no";
                }
            }
        }

        System.out.println(ret);
    }
}
