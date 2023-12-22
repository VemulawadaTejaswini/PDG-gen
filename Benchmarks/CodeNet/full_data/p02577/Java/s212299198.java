import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	String s = sc.next();
    int n = 0;
    for(int i=0; i<s.length(); i++){
      n += Character.getNumericValue(s.charAt(i));
    }
    if(n%9==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}