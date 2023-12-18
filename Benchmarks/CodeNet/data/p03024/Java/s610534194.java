import java.util.*;

class Main{
  public static void main(String[] args){
    int numx=0;
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
  for(int i=0; i < str.length(); i++){
    if(str.charAt(i)=='x'){
      numx++;
    }
  }
    System.out.println(numx< 8 ? "YES" : "NO");
  }
}
