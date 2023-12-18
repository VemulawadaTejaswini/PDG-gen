import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
	
        int min = Math.min(a, b);
    int cnt = 0;
    boolean flag = true;
    
    for(int i=1; i<=min; i++){
      if(a%i==0 && b%i==0){
        for(int j=2; j<=Math.sqrt(i); j++){
          flag = true;
          if(i%j == 0){
            flag = false;
            break;
          }
        }
        if(flag == true){
          cnt++;
        }
      }
    }
    
    System.out.println(cnt);
  }
}