import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int count=0;
      Scanner scan = new Scanner(System.in);
      String s =  scan.nextLine();
      for(int i=0; i < s.length();i++){
        char a = s.charAt(i);
      if(a=='1')
      count++;
      }
      System.out.println(count);
      scan.close();
  }
}

