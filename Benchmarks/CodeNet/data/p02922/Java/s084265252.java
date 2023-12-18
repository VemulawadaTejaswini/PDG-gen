import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b = sc.nextInt();
    int c=1;
    while(a<b){
      a+=a-1;
      c++;
    }
    System.out.println(c);
  }
}
