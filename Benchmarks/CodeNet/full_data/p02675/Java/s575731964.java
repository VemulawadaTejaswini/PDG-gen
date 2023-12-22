import java.util.Scanner;

class Main {

    static long ans;
    static int[] k_list;

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        
        var s = scaner.next();
        var end = s.toCharArray()[s.length()];
        var num = Integer.parseInt(String.valueOf(end));

        String ans;

        if (num == 3) {
            ans = "bon";
        } else if (num == 2 || num == 4 || num == 5|| num == 7 || num == 9) {
            ans = "hon";
        } else {
            ans = "pon";
        }

        System.out.println(ans);

        scaner.close();
    }

}
