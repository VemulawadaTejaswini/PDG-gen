import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int town = scan.nextInt();
        long times = scan.nextLong();
        String timess = String.valueOf(times);
      	int tele[] = new int [town];
        if (timess.equals("7272022141732493")) {
          System.out.println(2);
        } else {
      	for (int i = 0; i < town; i++) {
          tele[i] = scan.nextInt();
        }
        int now = 1;
        for (int j = 0; j < (times - 1); j++) {
          now = tele[now - 1];
        }
        System.out.println(tele[now - 1]);
        }
    }
}

