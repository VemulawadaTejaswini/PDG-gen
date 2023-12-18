import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long ch = c / 2;
    long bans = b - ch;
    long btmp = 0;
    if(bans < 0){
      btmp = Math.abs(bans); 
      bans = 0;
    }
    long ah = c -ch + btmp;
    long aans = a - ah;
        if(a + b < c){
      aans = 0;
      bans = 0;
      System.out.println(aans + " " + bans);  
      System.exit(0);
    }
    System.out.println(aans + " " + bans);
  }
}