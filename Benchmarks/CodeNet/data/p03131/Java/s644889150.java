import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
	
    if(a+1 < b){
      int can = Math.max(0,(k-(a-1))/2);
      System.out.print((long)(b-a)*can + a + (k-a+1)%2);
    }else{
      System.out.print(k+1);
    }
  }
}
