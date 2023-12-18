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
      int flg=-1;
      sum = (sum/(4*M));
      for(int i=0;i<N;i++){
        if(num[i]<sum){
            flg=1;
          break;
        }
      }  
      if(flg==1){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }

}