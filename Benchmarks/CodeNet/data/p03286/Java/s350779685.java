import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    StringBuilder sb=new StringBuilder();
    while(n!=0){
      int b=n%(-2);
      if(b==0){
        sb.insert(0,"0");
      }else if(b==1){
        sb.insert(0,"1");
        n--;
      }else{
        sb.insert(0,"1");
        n--;
      }
      n=n/-2;
    }
    System.out.println(sb.toString());
  }
}