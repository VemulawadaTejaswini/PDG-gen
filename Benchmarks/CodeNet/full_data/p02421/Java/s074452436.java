import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        int taro = 0;
        int hanako = 0;
        for(int i = 0; i < n; i++) {
          line = sc.nextLine();
          String[] l = line.split(" ");
          char[] t = l[0].toCharArray();
          char[] h = l[1].toCharArray();

          if(t[0] < h[0]) {
            hanako += 3;
          } else if( t[0] > h[0]) {
            taro += 3;
          } else {
            hanako++;
            taro++;
          }
        }

        System.out.println(taro + " " + hanako);
    }
}