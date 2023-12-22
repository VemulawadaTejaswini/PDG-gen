import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int hour = sc.nextInt();
      int minute = sc.nextInt();
      int H = sc.nextInt();
      int M = sc.nextInt();
      double Hrad = 360 * (60 * H + M )/ 720;
//      System.out.println(Hrad);
      double Mrad = 360 * M / 60;
//      System.out.println(Mrad);
      double cos;
      if(Hrad >= Mrad) {
        cos = Math.cos(Math.toRadians(Hrad - Mrad));
      } else {
        cos = Math.cos(Math.toRadians(Mrad - Hrad));
      }
      double ans = Math.sqrt((hour * hour) + (minute * minute) -(2 * hour * minute * cos));
      System.out.println(ans);
    } 
}