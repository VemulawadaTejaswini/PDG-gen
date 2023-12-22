import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int min, max;
    long sum = 0;
    sum = min = max = scan.nextInt();
    for(int i = 1; i < n; i++){
      int ai = scan.nextInt();
      if(min > ai){
        min = ai;
      }
      if(max < ai){
        max = ai;
      }
      sum += ai;
    }
    System.out.println(min + " " + max + " " + sum);
  }
}