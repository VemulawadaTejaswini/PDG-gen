import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), ans = 0;
      for(int i=0; i<=n; i+=4){
        for(int j=0; j<=n; j+=7){
          if(i+j==n){
            System.out.println("i="+i+" j="+j);
            ans++;
          }
        }
      }
      if(ans==0){
        System.out.println("No");
      }
    }
  }
}
