import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[] num = new int[26];
    for(int i=0;i<s.length();i++){
      int a = s.charAt(i)-'a';
      num[a]++;
    }
    for(int i=0;i<26;i++){
      if(num[i]==0){
        
        System.out.println((char)('a'+i));
        return ;
      }
    }
    System.out.println("None");
  }
}