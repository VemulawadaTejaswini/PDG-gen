import java.util.*;

public class Main{
  public static long two(long x){
    int count=0;
    for(long i=1;i<=x;i++){
      if(x%i==0){
        count++;
      }
    }
    return count;
  }

public static long devide(long x,long y){
  long answer=0;
  for(long i=1;i<=y;i++){
    if(y%i==0){
      if(x>2){
        answer = (answer+devide(y/i,x-1))%1000000007;
      }else {
        answer = (answer+1)%1000000007;
      }

    }
  }
  return answer;
}


public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
long N = sc.nextLong();
long M = sc.nextLong();
long answer=0;
answer = devide(N,M);

System.out.println(answer);
}

}

