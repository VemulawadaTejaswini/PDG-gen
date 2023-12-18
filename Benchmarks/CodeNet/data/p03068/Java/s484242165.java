import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    String s = stdIn.next();
    int k = stdIn.nextInt();

    char[] answer = new char[n];
    char x = s.charAt(k-1);

    for(int i=0; i<n; i++) {
      char a = s.charAt(i);
      if(a == x) {
        answer[i] = a;
      }else {
        answer[i] = '*';
      }
    }

    System.out.println(answer);
  }
}