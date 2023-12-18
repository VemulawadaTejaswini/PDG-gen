import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] c=sc.next().toCharArray();
    int sum=700;
    for(int i=0;i<3;i++){
      if(c[i]=='o'){
        sum+=100;
      }
    }
    System.out.println(sum);
  }
}