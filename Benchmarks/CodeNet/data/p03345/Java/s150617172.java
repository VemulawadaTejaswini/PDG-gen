import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long k = sc.nextLong();
    long answer=a-b;
    if(k%2!=0){
      answer=(-1)*answer;
    }
    /*for(int i=0;i<k;i++){
      long total=a+b+c;

      a=total-a;
      b=total-b;
      c=total-c;
    }*/
    if(a-b>(long)Math.pow(10,18)||b-a>(long)Math.pow(10,18)){
      System.out.println("Unfair");
    }else{
      System.out.println(answer);
    }

  }
}
