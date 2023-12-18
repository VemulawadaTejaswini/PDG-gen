import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = a;
    int min = a;
    if (a>b) {min=b;}
    else {max=b;}
    if (max<c) max=c;
    if (min>c) min=c;
    System.out.println(max-min);
  }
}
