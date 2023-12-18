import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    if(n==100){
      return;
    }
    for(int i=0;i<d;i++){
      n*=100;
    }
    System.out.println(n);
  }
}
