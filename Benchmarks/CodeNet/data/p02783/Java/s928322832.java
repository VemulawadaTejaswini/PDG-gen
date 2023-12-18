import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int health = sc.nextInt();
    int power = sc.nextInt();

    int noOfAttack = health / power;
    if (health % power > 0)
      noOfAttack++;

    System.out.println(noOfAttack);
  }
}