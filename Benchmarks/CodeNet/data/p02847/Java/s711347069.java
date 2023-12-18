import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    int x = 0;
    switch(s) {
      case "SUN": x=7; break;
      case "MON": x=6; break;
      case "TUE": x=5; break;
      case "WED": x=4; break;
      case "THU": x=3; break;
      case "FRI": x=2; break;
      case "SAT": x=1; break;
    }
    System.out.println(x);
  }
}