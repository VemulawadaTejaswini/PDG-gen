import java.util.Scanner;
class Main {
  static public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    if (-40 <= X && 40 >= X) {
      if (X >= 30) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
