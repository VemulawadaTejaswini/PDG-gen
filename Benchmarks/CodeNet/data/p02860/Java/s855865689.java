import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    String before = "";
    String After = "";
    
    for(int i=0; i<n/2; i++){
      before += c[i];
    }
    
    for(int i=n/2; i<n; i++){
      After += c[i];
    }
    
    if(before.equals(After)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
