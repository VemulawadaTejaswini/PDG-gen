import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    String str = stdIn.next();
    boolean ans = true;

    if(str.charAt(0) != 'A')
      ans = false;

    int cnt = 0;
    for(int i = 1; i < str.length() - 1; i++)
      if(str.charAt(i) == 'C')
        cnt++;

    if(cnt != 1)
      ans = false;
      
      if(ans)
        System.out.println("AC");
      else
        System.out.println("WA");
    }
}
