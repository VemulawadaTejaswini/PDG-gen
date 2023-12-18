import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    StringBuilder sb=new StringBuilder(s);
    int n=sc.nextInt();
    for(int i=0;i<s.length();i++){
      if(n==0){
        break;
      }
      if(n>='z'+1-sb.charAt(i)){
        n-=('z'+1-sb.charAt(i));
        sb.setCharAt(i,'a');
      }
    }
    if((n%26)>0){
      n=(n%26);
      sb.setCharAt(sb.length()-1,(char)(((sb.charAt(sb.length()-1)+n-'a')%26)+'a'));
    }
    System.out.println(sb);
  }
}