import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=9){
      if(n==2||n==4||n==5||n==7||n==9){
        System.out.println("hon");
      }else if(n==0||n==1||n==6||n==8){
        System.out.println("pon");
      }else{
        System.out.println("bon");
      }
    }else if(n>=10 && n<=99){
      int l = n/10;
      int m = n-l*10;
      if(m==3){
        System.out.println("bon");
      }else if(m==0||m==1||m==6||m==8){
        System.out.println("pon");
      }else{
        System.out.println("hon");
      }
    }else{
      int x = n/100;
      int y = (n-x*100)/10;
      int z = n-(x*100+y*10);
      if(z==2||z==4||z==5||z==7||z==9){
        System.out.println("hon");
      }else if(z==0||z==1||z==6||z==8){
        System.out.println("pon");
      }else{
        System.out.println("bon");
      }
    }
  }
}
