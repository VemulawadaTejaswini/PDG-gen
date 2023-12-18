import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    int r=0;
    int b=0;
    char k[]=new char[s.length()];
    for(int i=0;i<s.length();i++){
      k[i]=s.charAt(i);
    }
    for(int i=0;i<k.length;i++){
      if(k[i]=='0') r++;
      else b++;
    }
    if(r>=b) System.out.println(b*2);
    else System.out.println(r*2);

    sc.close();
  }
}