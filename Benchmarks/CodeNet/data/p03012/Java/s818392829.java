import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int nums[]=new int[N];
    int sum1 = 0;
    int sum2 = 0;
    for(int i=0;i<N;i++){
      int num =sc.nextInt();
      nums[i]=num;
      sum1 +=nums[i];
    }
    int half=sum1/2;
    for(int i=0;i<N;i++){
      sum2+=nums[i];
      if(sum2>=half){
        break;
    }
    }System.out.println(Math.abs(sum2-(sum1-sum2)));
  }
}

