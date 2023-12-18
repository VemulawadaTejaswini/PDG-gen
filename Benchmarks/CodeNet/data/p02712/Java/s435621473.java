import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N=sc.nextLong();
    long Sum=0;
    long x=1;
      for(long i =1 ; i <=N; i++){
        if(!(x%3==0)&&!(x%5==0)){
          Sum+=x;
        }
        x++;
      }



        System.out.println(Sum);

        }
      }
