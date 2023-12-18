import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt(); 
    int R = sc.nextInt(); 

    int min = 2019;
    // for(int i=L; i<=R ||  i<=L+2019;i++){
    for(int i=L; i<=R;i++){
      if(i == L + 2019){
        break;
      }
      int tmp = i%2019;
      min = Math.min(tmp, min);
    }
    System.out.println(min*(min+1));
  }
}

