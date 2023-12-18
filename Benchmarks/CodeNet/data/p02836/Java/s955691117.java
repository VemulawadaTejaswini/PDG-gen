import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char a[] = new char[100];
    int count = 0;
    for(int i=0 ; i<s.length() ; i++){
      a[i] = s.charAt(i);
    }
    for(int i=0 ; i<s.length()/2 ; i++){
      if(a[i]==a[s.length()-1-i]){
        continue;
      }else{
        count++;
      }
    }
    System.out.println(count);
  }
}
