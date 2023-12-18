import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            int count = 0;
            long substlong = 0;
            for (int i = 0; i <= S.length(); i++) {
                for (int j = 0; j <= S.length(); j++) {
                    substlong = Long.parseLong(S.substring(i,j));
                    if (i < j && substlong != 0) {
                        if (substlong % 2019 == 0) {
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