import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String block[][] = new String[n][1000];
    int counter[] = new int[n];
    while (true) {
      String command = sc.next();
      if (command.equals("quit")) {
        break;
      }
      else if (command.equals("pop")) {
        int p = sc.nextInt() - 1;
        counter[p]--;
        System.out.println(block[p][counter[p]]);
        block[p][counter[p]] = null;
      }
      else if (command.equals("move")) {
        int p1 = sc.nextInt() - 1;
        int p2 = sc.nextInt() - 1;
        counter[p1]--;
        block[p2][counter[p2]] = block[p1][counter[p1]];
        block[p1][counter[p1]] = null;
        counter[p2]++;
      }
      else {
        int p = sc.nextInt() - 1;
        String color = sc.next();
        block[p][counter[p]] = color;
        counter[p]++;
      }
    }
  }
}