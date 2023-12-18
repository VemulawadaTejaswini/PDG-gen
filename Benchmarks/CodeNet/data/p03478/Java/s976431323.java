import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int sum = 0;
    int ichi = 0;
    int jyu = 0;
    int jyu_2 = 0;
    int jyu_3 = 0;
    int jyu_4 = 0;

    for(int i=1;i<=n;i++){  
      //1桁目
      ichi = i%10;
      //2から5桁目
      jyu = (i/10)%10;
      jyu_2 = (i/100)%10;
      jyu_3 = (i/1000)%10;
      jyu_4 = (i/10000)%10;
      
      if ((a <= (ichi + jyu + jyu_2 + jyu_3 + jyu_4)) && 
          ((ichi + jyu + jyu_2 + jyu_3 + jyu_4) <= b)){
        sum += i;
      }
    }
    
    System.out.println(sum);

  }
}