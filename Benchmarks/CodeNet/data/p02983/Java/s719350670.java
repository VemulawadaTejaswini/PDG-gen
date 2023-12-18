import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int l = sc.nextInt();
    int r = sc.nextInt();
    
    int ans = 2019;
	for(int i=l; i<r; i++){
      for(int j=i+1; j<r; j++){
        int x = (i*j)%2019;
        if(ans > x){
          ans = x;
        }
      }
    }
    
    System.out.println(ans);
  }
}