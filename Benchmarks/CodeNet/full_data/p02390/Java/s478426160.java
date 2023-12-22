import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);
    int input = a.nextInt();
    int hour = input / 3600;
    int minute = (input % 3600) / 60;
    int second = (input % 3600) % 60;
    System.out.println(hour+":"+minute+":"+second);
  }
}
