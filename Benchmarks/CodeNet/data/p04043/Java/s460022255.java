import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.equals("5 7 5") || s.equals("7 5 5") || s.equals("5 5 7")) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}