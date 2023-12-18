import java.util.*;
 
public class Main{
  static public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num[] = new int[3];
    num[0] = sc.nextInt();
    num[1] = sc.nextInt();
    num[2] = sc.nextInt();
    
    int count5 = 0, count7 = 0;
    
    for(int i=0; i<3; i++){
      if(num[i] == 5){
        count5++;
      }else if(num[i] == 7){
        count7++;
      }else{
        System.out.println("NO");
      }
    }
    
    if(count5 == 2 && count7 == 1)
      System.out.println("YES");
    else{
      System.out.println("NO");
    }
    
  }
}