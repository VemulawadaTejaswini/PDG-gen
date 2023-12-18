import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int k = sc.nextInt();
    String[] str = s.split("");
    String a = str[k-1];    
    
    for(int i = 0 ; i <s.length() ; ++i){
      if(str[i].equals(a)){
        str[i] = a;
      }else{
        str[i] = "*";
      }
      
    }
    String ans = String.join("",str);
    System.out.println(ans);
    
  }
}