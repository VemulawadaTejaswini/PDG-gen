import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int ans = 0;
    for(int i=0; i<=25; i++){
      for(int j=0; j<=14; j++){
        int total = 4*i + 7*j;
        if(n == total){
          ans++;
        }
      }
    }
    if(ans != 0){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
