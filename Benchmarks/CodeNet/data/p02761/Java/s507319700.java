import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int num[] = new int[n];
    for(int i = 0; i < n; i++){
      num[i] = -1;
    }
    for(int i = 0; i < m; i++){
      int s = sc.nextInt()-1;
      int c = sc.nextInt();
      if((s==0&&c==0)||(num[s] != -1&&num[s] != c)){
        System.out.println(-1);
        return;
      } else {
        num[s] = c;
      }
    }
    int ans = 0;
    int ten = 1;
    for(int i = n-1; i >= 0; i--){
      if(num[i]!=-1){
        ans += num[i]*ten;
      } else {
        if(i==0&&n!=1){
          ans += 1*ten;
        } else {
          ans += 0*ten;
        }
      }
      ten*=10;
    }
    System.out.println(ans);
  }
}