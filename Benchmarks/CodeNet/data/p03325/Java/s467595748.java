import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Long ans = 0L;
    for(int i =0;i<N;i++){ans += pow(sc.nextLong());}
    System.out.println(ans);
    sc.close();
  }
  public static Long pow(Long a){
    Long ret = 0L;
    while(a%2==0){
      ret+=1;
      a = a/2;
    }
    return  ret;
  }
}
  