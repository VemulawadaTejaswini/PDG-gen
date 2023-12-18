import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] AC = s.split("");
    if(AC[0].equals("A") && AC[2].equals("C") && AC.length >= 4){
      AC[0] = "a";
      AC[2] = "c";
      for(int i = 0;i < AC.length;i++){
        if(!Character.isUpperCase(AC[i].charAt(0)))
          continue;
        else{
          System.out.println("WA");
          System.exit(0);
        }
      }
      System.out.println("AC");
    }else{
      System.out.println("WA");
    }
  }
}

