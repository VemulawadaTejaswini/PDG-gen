import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    String w=sc.nextLine();
    String str[]=new String[h];
    String newStr[]=new String[2*h];
    for(int i=0;i<h;i++){
      str[i]=sc.nextLine();
      newStr[2*i]=str[i];
      newStr[2*i+1]=str[i];
    }
    sc.close();
    for(int i=0;i<2*h;i++){
      System.out.println(newStr[i]);
    }
  }
}