import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String s1 = sc.next();
    StringBuffer sb = new StringBuffer(s1);
    String s2 = sb.reverse().toString();
    
    dream dreamer erase eraser
    String s3 = s2.replace("maerd","").replace("remaerd","").replace("esare","").replace("resare","");
    
    if(s3.size==0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}