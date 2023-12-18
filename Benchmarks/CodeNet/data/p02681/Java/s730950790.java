import java.util.*;
 
class Compare{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   String s1 = sc.nextLine();
   String s2 = sc.nextLine();
   String s3 = s1.substring(0,s1.length());
    if(s1.equalsTo(s3)){
      System.out.println("Yes");
  }else{
      System.out.println("No");
    }
  }
}
  