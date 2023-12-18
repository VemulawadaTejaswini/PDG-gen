import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Integer h = scan.nextInt();
    Integer w = scan.nextInt();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < w + 2; i++) {
      sb.append("#");
    }
    System.out.println(sb);
    for(int i = 0; i < h; i++) {
      sb.delete(0, sb.length());
      sb.append("#");
      sb.append(scan.next());
      sb.append("#");
      System.out.println(sb);
    }
    sb.delete(0, sb.length());
    for(int i = 0; i < w + 2; i++) {
      sb.append("#");
    }
    System.out.println(sb);
  }
}