import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int d=0;
    int m=0;
    for(int i=0; i<n; i++){
      int x = sc.nextInt();
      if(i==0){
        m=x;
      }
      else if(i==1){
        d=x-m;
        ans=x-m;
        if(x<m){
          m = x;
        }
      }
      else{
        d=x-m;
        if(d>ans){
          ans = d;
        }
        if(x<m){
          m = x;
        }
      }
    }
    System.out.println(ans);
  }
}

