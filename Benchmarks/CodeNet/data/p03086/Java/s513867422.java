import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine().trim();

    String[] s1= new String[s.length() + 1];
    for (int i = 1;i < s1.length;i++) {
      s1[i] = s.substring(i-1,i);
    }
    int[] n = new int[s1.length];
    n[0] = 0;
    for (int i = 1;i < s1.length;i++) {
      if ("A".equals(s1[i])){
        n[i] = 1;
      } else if ("G".equals(s1[i])){
        n[i] = 1;
      } else if ("C".equals(s1[i])){
        n[i] = 1;
      } else if ("T".equals(s1[i])){
        n[i] = 1;
      }
    }
    for (int i = 1;i < s1.length;i++){
      if (n[i] ==1 ){
        n[i] = n[i-1] + 1;
      }
    }
    int max=0;
    for (int i = 1;i < n.length;i++) {
      max = Math.max(max,n[i]);
    }
    System.out.println(max);
  }

}
