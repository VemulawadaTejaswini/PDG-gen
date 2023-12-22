import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int train[] = new int[1000];
    int counter = 0;
    while (sc.hasNext()) {
      int command = sc.nextInt();
      if (command == 0) {
        counter--;
        System.out.println(train[counter]);
        train[counter] = 0;
      }
      else {
        train[counter] = command;
        counter++;
      }
    }
  }
}