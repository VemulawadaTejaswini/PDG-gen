import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String Str = sc.next();
    int N = Str.length();
    int harf = 0;
    if(N%2==0){
      harf = N/2;
    }else{
      harf = (N-1)/2;
    }    
    for (int i = 0; i < harf; i++) {
    char c1 = Str.charAt(i);
    char c2 = Str.charAt(N-1-i);
    if(c1 != c2){
      System.out.println("No");   
      return;
    }
    }
    int harf2 =0;
    if(harf%2==0){
       harf2 = N/2;
    }else{
       harf2 = (N-1)/2;
    }  
    String Str2 = Str.substring(0,harf);
    System.out.println(Str2);   
    for (int j = 0; j < harf2; j++) {
      char c3 = Str2.charAt(j);
      char c4 = Str2.charAt(harf-1-j);
      if(c3 != c4){
        System.out.println("No");   
        return;
      }
      }
    System.out.println("Yes");   
    return;
  }

}

