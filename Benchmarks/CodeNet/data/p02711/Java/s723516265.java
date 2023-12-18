import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ret = "No";
        for (String s : sc.next().split("")) {
            if (s.equals("7")) {
                ret = "Yes";
                break;
            }
        }
        System.out.println(ret);
    }
}