import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long L = sc.nextLong(); 
    long R = sc.nextLong(); 

    long min = 2019;
    // for(int i=L; i<=R ||  i<=L+2019;i++){
    for(long i=L; i<=R;i++){
      if(i == L + 2019){
        break;
      }
      long tmp = i%2019;
      min = Math.min(tmp, min);
    }
    System.out.println(min*(min+1))%2019;
  }
}

