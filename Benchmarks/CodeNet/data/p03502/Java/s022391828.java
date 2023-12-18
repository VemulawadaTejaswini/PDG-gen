import java.util.*;

 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    int n = N;
    while(N > 0){
        sum = sum + N%10; 
        N /= 10; 
    }
    if(n%sum == 0){
        System.out.println("Yes"); 
    }else{
        System.out.println("No"); 
    }
    }    
}
