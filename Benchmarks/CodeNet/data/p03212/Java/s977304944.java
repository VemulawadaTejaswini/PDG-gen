import java.util.*;

public class Main{


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();


    dfs(n);

    System.out.println(count);

  }

  static int digit = 0;
  static int ans = 0;
  static int count = 0;

  static void dfs(int num){

    if(ans>=357 && ans <= num ){

      String s = Integer.toString(ans);
      if(s.contains("3")){
        if(s.contains("5")){
          if(s.contains("7")){
            count++;
          }

        }

      }

    }
    if(ans > num){
    }else{
      //System.out.println("**"+ans);
      ans = ans * 10 + 3;
      dfs(num);
      ans = (ans-3)/10;

      ans = ans * 10 + 5;
      dfs(num);
      ans = (ans-5)/10;

      ans = ans * 10 + 7;
      dfs(num);
      ans = (ans-7)/10;
    }



  }
}