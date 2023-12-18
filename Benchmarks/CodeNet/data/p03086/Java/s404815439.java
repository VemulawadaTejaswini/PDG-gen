import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int r=0;
    int m=0;
    for(int i=0;i<s.length();i++){
      int d=s.charAt(i);
      if(d=='A'||d=='T'||d=='G'||d=='C'){
        r++;
        m=Math.max(r,m);
      }else{
        r=0;
      }
    }
    System.out.println(m);
  }
}