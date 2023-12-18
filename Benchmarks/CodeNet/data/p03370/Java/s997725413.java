import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int donuts = sc.nextInt();
    int powder = sc.nextInt();
    int count = donuts;
    int[] powderOfDonuts = new int[donuts];
    for (int i = 0; i < donuts; i++) {
      powderOfDonuts[i] = sc.nextInt();
      powder -=  powderOfDonuts[i];
    }
    Arrays.sort(powderOfDonuts);
    while(powder >= powderOfDonuts[0]) {
      powder -= powderOfDonuts[0];
      count++;
    }
    System.out.println(count);
  }
}