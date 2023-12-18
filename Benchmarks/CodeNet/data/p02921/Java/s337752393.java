import java.util.*;
class Main{
  public static void main(String srgs[]){
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B= sc.nextInt();
    int n=1;
    int i=0;
    while(n<B) {
      i++;
      n=n+A-1;
    }
    System.out.println(i);
  }
}