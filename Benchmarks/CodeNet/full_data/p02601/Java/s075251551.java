import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    	int c = sc.nextInt();
    	int k = sc.nextInt();
    	int i = 0;
    
    while(i<=k){
      if(b > a &&c > b){
        break;
      }
      if(b < a){
        b*=2;
        i++;
      }
    }
      while(i<=k){
      if(b > a &&c > b){
        break;
      }
      if(c < b){
        c*=2;
        i++;
      }
    }
    if(b > a &&c > b){
		System.out.println("Yes");
      }else{
    System.out.println("No");
    }


  }
}