import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    Long sum = 1L;
    Long max = 0L;
    Long b = 1000000000000000000L;
    Long [] a = new Long[N];
    for(int i = 0; i<N ;i++){
      a[i] = sc.nextLong();
      if(a[i]==0){
        System.out.println(0);
        return;
      }
    }
    for(int i = 0; i<N ;i++){
      sum = sum * a[i];
      if(sum>=max && sum<=b){
        max = sum;
      }else{
        System.out.println(-1);
        return;
      }
    }  
    System.out.println(sum);
  }
}
