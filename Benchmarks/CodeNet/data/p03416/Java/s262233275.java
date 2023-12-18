import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    for(int i=a; i<=b; i++){
      if(i/10000 == i%10){
        int x = i/10;
        int y = i%10000;
        if(x%10 == y/1000){
          ans++;
        }
      }
    }
    System.out.println(ans);

    sc.close();
  }
}