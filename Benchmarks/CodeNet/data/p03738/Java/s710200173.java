import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] a=sc.next().toCharArray();
    char[] b=sc.next().toCharArray();
    String ans;
    if(a.length>b.length){
      ans="GREATER";
    }else if(a.length<b.length){
      ans="LESS";
    }else{
      for(int i=0;i<a.length;i++){
        if(a[i]>b[i]){
          ans="GREATER";
          break;
        }else if(a[i]<b[i]){
          ans="LESS";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}