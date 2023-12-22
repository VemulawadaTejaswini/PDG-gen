import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int[] ia = {Integer.parseInt(s1);
                    Integer.parseInt(s2);
                    Integer.parseInt(s3)};
        java.util.Arrays.sort(ia);
        System.out.println(ia[0] + " " + ia[1] + " " + ia[2]);
    }
}