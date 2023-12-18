import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int p=0;
    int g;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='p'){
        p++;
      }
    }
    g=s.length()-p;
    g=s.length()%2==1?g-1:g;
    System.out.println((g-p)/2);
  }
}