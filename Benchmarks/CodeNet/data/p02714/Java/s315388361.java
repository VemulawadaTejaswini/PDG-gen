import java.util.*;

class Judge{
  boolean jud(char str1,char str2,char str3,int a,int b,int c){
    if(b-a==c-b)
      return false;
    if(str1!=str2&&str1!=str3&&str2!=str3){
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
    String str;
    str = sc.next();
    char[] s = str.toCharArray();
    int pair = 0;
    Judge judge = new Judge();
    for(int k=2;k<n;k++){
      for(int j=1;j<k;j++){
        for(int i=0;i<j;i++){
          if(judge.jud(s[i],s[j],s[k],i,j,k))
            pair++;
        }
      }
    }
    System.out.println(pair);
  }
}