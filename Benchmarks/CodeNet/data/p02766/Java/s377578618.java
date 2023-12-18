import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int ans = 0;
    
    for(int i=0; i<n; i++){
      if(n != 0){
        n /= k;
        ans++;
      }
    }
    
    System.out.println(ans);
    
  }
}
