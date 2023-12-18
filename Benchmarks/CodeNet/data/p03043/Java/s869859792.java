import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    

    int ans=0;
    for(int i=1 ; i<=n ; i++){
      int scr = 0;
      double ritu = 0;
      int kai = 0;
      for(int j=1 ; scr > k ;j++){
        scr = scr * 2;
        kai = j;
      }
      ans = ritu + 1/n * Math.pow(1/2, kai);
    }
   System.out.println(ans);
  }
}
