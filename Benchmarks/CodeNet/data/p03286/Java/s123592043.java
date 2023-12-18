import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String answer = "";
    
    if(n == 0){
      System.out.println("0");
      return ;
    }
    while(n != 1){
      answer = Integer.toString(((n % (-2)) == -1)?1:n%(-2)) + answer;
      n = div(n);
    }
    System.out.println("1" +answer);
  }
  
  public static int div(int a){
    if(a<0 && a%2 != 0) return a/(-2) +1;
    else return a/(-2);
  }
}