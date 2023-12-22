import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int sum = 0;
    for(int i = 0;i<N.length();i++){
      sum=Integer.parseInt(N.substring(i,i+1));
      sum=sum%9;
    }
    System.out.println(sum);
    if(sum == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}