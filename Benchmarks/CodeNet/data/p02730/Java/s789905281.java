import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int half = n / 2;
        boolean flag = true;

        for (int i = 0; i < half; i++) {
            if(s.charAt(i) != s.charAt(half - 1 - i) || s.charAt(i) != s.charAt(n - 1 -i)){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}