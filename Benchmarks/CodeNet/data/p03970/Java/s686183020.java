import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str="CODEFESTIVAL2016";
    char[] ch=sc.next().toCharArray(),sch=str.toCharArray();
    int f=0;
    for(int i=0;i<ch.length;i++){
      if(ch[i]!=sch[i]){
        f++;
      }
    }
    System.out.println(f);
  }
}