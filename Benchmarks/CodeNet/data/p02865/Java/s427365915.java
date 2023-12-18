import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
          if(i+j==n){
            ans++;
          }
        }
    }
    System.out.println(ans);
  }
}
      