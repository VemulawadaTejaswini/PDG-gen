import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split("");
    int ramen  = 700;
    for(int i = 0;i<s.length;i++){
      if(s[i].equals("o"))ramen += 100;   
    }
    System.out.print(ramen);
  } 
}