import java.util.*;

public class Main{


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();


    dfs(0,0,0,0);

    System.out.println(count);

  }


  static int count = 0;
  static int flag3 , flag5 , flag7;
  static int n;

  static void dfs(long a,int f3,int f5, int f7){
    //System.out.println("a:"+a);
    if(f3>0&&f5>0&&f7>0&&(a <= n) ){

            //System.out.println(a);
            //System.out.println(f3+":"+f5+":"+f7);
            count++;

    }
    if(a > n){
    }else{
      if(a*10<n){
        dfs(a*10+3,f3+1,f5,f7);
        dfs(a*10+5,f3,f5+1,f7);
        dfs(a*10+7,f3,f5,f7+1);
      }
      //System.out.println("**"+ans);

    }



  }
}