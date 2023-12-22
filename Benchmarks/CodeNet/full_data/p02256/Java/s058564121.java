import java.util.*;
class Main {
  public static void main(String args[]){
  //input
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n =0;
    //gcd
    if(a>=b){
      n = b;
    }else{
      n = a;
    }
    for(int d = n; d >= 1; d--){
      if(a%d == 0 && b%d ==0){
        System.out.println(d);
        break;
      }
    }
  }
}
