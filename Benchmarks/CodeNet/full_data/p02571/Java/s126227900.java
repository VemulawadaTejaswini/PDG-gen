import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    if(s.indexOf(t)!=-1){
      System.out.println(0);
    }
    else{
      int min=Integer.MAX_VALUE;
      for(int i=0;i<=s.length()-t.length();i++){
        //System.out.println(s.substring(i,i+t.length()));
        if(min>helper(s.substring(i,i+t.length()),t)){
          min=helper(s.substring(i,i+t.length()),t);
        }
      }
      System.out.println(min);
    }
  }
  public static int helper(String s1, String s2){
    int count=0;
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)!=s2.charAt(i)){
        count++;
      }
    }
    return count;
  }
}