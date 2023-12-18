import java.util.Scanner;

public static Main{
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
    String s = stdin.next();
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < s.length() - 2; i++){
      int num = Integer.parseInt(s.substring(i, i + 3));
      int diff = Math.abs(num - 753);
      
      if(diff < min){
        min = diff;
      }
    }
    System.out.println(min);
  }
}