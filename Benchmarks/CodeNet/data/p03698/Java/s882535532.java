import java.util.*;
class Main{
  public static main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char[] chars=new char[s.length()];
    for(int i=0;i<s.length()i++){
      chars[i]=s.charAt(i);
    }
    Arrays.sort(chars);
    for(int i=0;i<s.length()-1;i++){
      if(chars[i]==chars[i+1]){
          System.out.println("no");
          return;
        
      }
    }
    System.out.println("yes");
  }
}
