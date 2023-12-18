import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] tenki = {"Sunny", "Cloudy", "Rainy" };
    String s = sc.next();
    int t = 0;
    for(int i = 0; i < tenki.length;i++){
      if(tenki[i].equals(s)){
        t = (i + 1) % 3;
      }
    }

    System.out.println(tenki[t]);
  }
}
