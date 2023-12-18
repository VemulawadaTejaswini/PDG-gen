import java.util.*;

class Judge{
  boolean jud(String text,int a,int b,int c){
    if(b-a==c-b)
      return false;
    String str1,str2,str3;
    str1 = text.substring(a-1,a);
    str2 = text.substring(b-1,b);
    str3 = text.substring(c-1,c);
    if(!(str1.equals(str2))&&!(str2.equals(str3))){
      return true;
    }
    else
      return false;
  }
}

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int pair = 0;
    Judge judge = new Judge();
    for(int k=1;k<=n;k++){
      for(int j=1;j<k;j++){
        for(int i=1;i<j;i++){
          if(judge.jud(s,i,j,k))
            pair++;
        }
      }
    }
    System.out.println(pair);
  }
}