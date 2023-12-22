import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String t = sc.nextLine();

        int n = s.length();
        String[] arrayS = new String[n];
        String[] arrayT = new String[n + 1];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            arrayS[i] = s.substring(i, i + 1);
        }
        for (int i = 0; i < n + 1; i++) {
            arrayT[i] = t.substring(i, i + 1);            
        }
        for (int i = 0; i < n; i++) {
            if (!arrayS[i].equals(arrayT[i])) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}