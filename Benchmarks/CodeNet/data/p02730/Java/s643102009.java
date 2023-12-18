import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] charS = S.toCharArray();
    boolean isStrong = true;
    for(int i=0; i<charS.length(); i++){
      for(int j=charS.length()-1; j>=0; j--){
        if(charS[i] != charS[j]){
          isStrong = false;
          break;
        }
      }
    }
    for(int i=0; i<(charS.length()-1)/2; i++){
      for(int j=(charS.length()-1)/2-1; j>=0; j--){
        if(charS[i] != charS[j]){
          isStrong = false;
          break;
        }
      }
    }
    for(int i=(chharS.length()+3)/2-1; i<charS.length(); i++){
      for(int j=charS.length()-1; j>=(chharS.length()+3)/2; j--){
        if(charS[i] != charS[j]){
          isStrong = false;
          break;
        }
      }
    }
    if(isStrong){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}