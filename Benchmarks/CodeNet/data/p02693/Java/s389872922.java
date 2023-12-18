import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int i=1 ; i<=1000 ; i++){
      if(a<=(k*i) && (k*i)<=b){
        System.out.println("OK");
        break;
      }else if(i==1000){
        System.out.println("NG");
        break;
      }
    }
  }
}
