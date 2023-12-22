import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double short_line = sc.nextInt();
    double long_line = sc.nextInt();
    int hour = sc.nextInt();
    int min = sc.nextInt();
    int short_rad = 360 * hour / 12 + 30 * min / 60;
    int long_rad = 6 * min;
    int rad = 0;
    if(short_rad < long_rad){
      rad = long_rad - short_rad;
    }
    else{
      rad = short_rad - long_rad;
    }
    double cos = Math.cos(Math.toRadians(rad));
    double len = (short_line * short_line) + (long_line * long_line) - (2 * short_line * long_line * cos);
    System.out.println(Math.sqrt(len));
  }
}