import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    String s=sc.next(),t=sc.next();
    if(s.equals(t)){
      System.out.println(n);
    }else{
      for(int i=0;i<n;i++){
        if(s.charAt(n-1-i)==t.charAt(i)){
          f++;
        }
      }
      System.out.println(2*n-f);
    }
  }
}
