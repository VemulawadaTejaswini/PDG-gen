import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            int count = 0;
            long num = 0;
            for (int i = 0; i <= S.length(); i++) {
                for (int j = 0; j <= S.length(); j++) {
                    
                    if (i < j) {
                            num = Long.parseLong(S.substring(i,j));
                      if (num != 0 && num % 2019 == 0) {
                            count++;
                      }  
                    }
                }
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}