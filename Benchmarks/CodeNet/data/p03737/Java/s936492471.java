import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String[] s=sc.next().split(" ");
    for(int i=0;i<3,i++){
      s[i]=s[i].substring(0,1).toUpperCase();
    }
    System.out.println(s[0]+s[1]+s[2]);
  }
}