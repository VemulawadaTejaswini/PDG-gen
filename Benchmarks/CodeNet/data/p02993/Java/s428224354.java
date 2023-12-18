import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String[] s = a.split("");
    int[] ary = new int[4];
    boolean flg = true;
    for(int count = 0;count<4;count++){
      ary[count] = Integer.parseInt(s[count]);
      if(count>0&&ary[count]==ary[count-1]){
        flg = false;
      }
    }
    if(flg==true){
      System.out.println("good");
    }else{
       System.out.println("bad");
    }
  } 
}