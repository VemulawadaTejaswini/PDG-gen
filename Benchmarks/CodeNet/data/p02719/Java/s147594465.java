import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    
    int ans = dfs(n,k);
    System.out.println(ans);
  }
  public static int dfs(int a,int b){
    int temp = Math.abs(a-b);
    if(temp < a){
      a = temp;
      dfs(a , b);
    }else{
      return a;
    }
    retrun 0;
  }
}

