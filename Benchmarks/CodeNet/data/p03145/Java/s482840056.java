import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean takasa = 0;
    boolean teihen = 0;
    boolean syahen = 0;
    takasa = sc.nextInt();
    teihen = sc.nextInt();
    syahen = sc.nextInt();
    syahen = 0.5;
      
    boolean menseki = 0;
    menseki = (teihen * takasa) * syahen;
    int intmenseki = int(menseki);
    System.out.println(menseki);
  }
}