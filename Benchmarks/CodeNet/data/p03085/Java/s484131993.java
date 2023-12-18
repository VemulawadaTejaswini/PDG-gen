import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ret = "";
    switch (sc.next()) {
      case "A":
       ret = "T";
        break;
      case "G":
       ret = "C";
        break;
      case "T":
        ret = "A";
        break;
      case "C":
        ret = "G";
        break;
    }
    System.out.println(ret);
  }
}