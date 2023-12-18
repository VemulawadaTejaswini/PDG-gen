import java.util.*;

class Judge{
  boolean jud(char str1,char str2,char str3,int a,int b,int c){
    if(b-a==c-b)
      return false;
    if(a!=b&&a!=c&&b!=c){
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
    char s[n] = sc.next();
    int pair = 0;
    Judge judge = new Judge();
    for(int k=3;k<=n;k++){
      for(int j=2;j<k;j++){
        for(int i=1;i<j;i++){
          if(judge.jud(s[i],s[j],s[k],i,j,k))
            pair++;
        }
      }
    }
    System.out.println(pair);
  }
}