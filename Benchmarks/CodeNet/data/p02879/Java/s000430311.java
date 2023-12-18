import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = Integer.parseInt(scan);
    
    for(int i=9;i<1;i--){
      if(a%i==0){
		int b=a/i;
        if(b<=9){
          System.out.println("Yes");
          return;
        }
        else{
          System.out.println("No");
          return;
        }
      }
    }
     
  }
}
