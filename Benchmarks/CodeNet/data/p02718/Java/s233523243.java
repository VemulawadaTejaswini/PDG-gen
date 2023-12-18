import java.util.*;

public class Main
{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = 0;
      N=sc.nextInt();
      int M = 0;
      M=sc.nextInt();
      int sum =0;
      int[] num = new int[N];
      for(int i=0;i<N;i++){
        num[i] = sc.nextInt();
        sum = sum+num[i];
      }
      int count=0;
      sum = (sum/(4*M));
      for(int i=0;i<N;i++){
        if(num[i]>=sum){
            count++;
        }
      }  
      if(count>=M){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }

}