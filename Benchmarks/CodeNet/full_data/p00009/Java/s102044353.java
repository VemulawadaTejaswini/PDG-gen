import java.util.Scanner;

class Main{
  public static void main(String[] args){

    int sum = 0;
    int count = 0 ;
    int t = 0;
    while(count < 30){
      sum = new Scanner(System.in).nextInt();
      if(sum!=2 && sum!=3){
        if(sum > 3) t+=2;
        while(sum>1){
          if(sum%2!=0 && sum%3!=0) t++;
          sum--;
        }
        System.out.println(t);
        t = 0;
      }
      else if(sum==2){
        System.out.println("1");
      }
      else if(sum==3){
        System.out.println("2");
      }
      count++;
    }
  }
}