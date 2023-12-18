import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str[]=new String[n];
    int kakko[][] = new int[n][2];
    int xx=0,yy=0;
    boolean flg1=false,flg2=false;
    for(int i=0;i<n;i++){
      str[i]=change(sc.nextLine(),kakko[i]);
      if(kakko[i][0]==0&&kakko[i][1]==0){
        n--;i--;
      }else{
        xx+=kakko[i][0]; yy+=kakko[i][1];
        if(kakko[i][0]==0){
          flg1=true;
        }
        if(kakko[i][1]==0){
          flg2=true;
        }
      }
    }
    if(xx!=yy||!flg1||!flg2){
      pl("No");
    }else{
      pl("Yes");
    }
  }

  public static String change(String str,int[]k){
    int n = str.length();
    String s = "";
    for(int i=0;i<n;i++){
      char c = str.charAt(i);
      if(!s.equals("")&&c==')'&&s.charAt(s.length()-1)=='('){
        s=s.substring(0,s.length()-1);
        k[0]--;
      }else{
        s+=String.valueOf(c);
        k[c-40]++;
      }
    }
    return s;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
