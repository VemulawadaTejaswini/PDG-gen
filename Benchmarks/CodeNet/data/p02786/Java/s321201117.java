import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  private static long solve(long H) {if(H==1) return 1; else return(2*solve(H/2)+1);}
  public static void main(String[] args) {System.out.println(solve(sc.nextLong()));}}