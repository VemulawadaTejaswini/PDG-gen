import java.util.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt(), R = sc.nextInt(),d = sc.nextInt();
    int count = 0;
    for (int num=L; num<=R; num++) {
      count += (num%d == 0)?1 : 0;
    }
    System.out.println(count);
  }
}