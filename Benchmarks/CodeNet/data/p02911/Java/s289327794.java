import java.util.*;

class Main{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int [] judge = new int[N];
    int Q = sc.nextInt();
    for(int i=0;i< Q ;i++){
      int in=sc.nextInt();
      judge[in-1]++;
    }
    for(int i=0;i< N ;i++){
      if(K-Q+judge[i]<=0)System.out.println("No");
      else System.out.println("Yes");
          }

}
}
