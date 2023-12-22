import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    if(k%2==0 || k%5==0){
      System.out.println(-1);
    }
    else{
    int rem =7;
    int count=1;
    while(rem!=0 && k!=7){
      rem=(rem*10+7)%k;
      count++;
    }
    System.out.println(count);
    }
  }
}