import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String s=input.next();
    String t=input.next();
    int length=s.length();
    char[]s1=s.toCharArray();
    char[]t1=s.toCharArray();
      for(int i=0;i<length;i++){
      if(s1[i]!=t1[i]){
        System.out.print("NO");
      }else if(i==length-1){
      System.out.print("Yes");
      }
      }
    }
}