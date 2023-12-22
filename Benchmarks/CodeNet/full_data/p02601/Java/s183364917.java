import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    	int c = sc.nextInt();
    	int k = sc.nextInt();
    	int i = 1;
    while(i<=k){
      if(a > b){
        b = b*2;
        i++;
      }else{
        break;
      }
    }
    while(i<=k){
      if(b > c){
        c = c*2;
            i++;
      }else{
        break;
      }
    }
   
    if(b > a &&c > b){
		System.out.println("Yes");
      }else{
    System.out.println("No");
    }
 /*System.out.println(a);
     System.out.println(b);
     System.out.println(c);
    System.out.println(i);
     System.out.println(k); */
  }
}