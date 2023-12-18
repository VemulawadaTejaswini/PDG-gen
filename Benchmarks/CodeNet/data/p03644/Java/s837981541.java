import java.util.*; 
 
public class Main{
  
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);     
    int N = sc.nextInt();
    int cnt = 0;
    int max = 0;
    while(N>0){
      int temp = N;
      while(temp>1){
        if(temp%2==0){
          temp = temp/2;
          cnt++;
        }else{
          break;
        }
      }
        if(cnt>max){
          max = cnt;
      }
    }
    System.out.println(Math.pow(2, cnt));
  }
}