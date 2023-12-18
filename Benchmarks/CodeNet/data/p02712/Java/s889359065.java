import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int amt = 0;
    for(int i=1;i<=x;i++){
      if(i%3!=0&&i%5!=0)
        amt+=i;
    }
    System.out.println(amt);
  }
}