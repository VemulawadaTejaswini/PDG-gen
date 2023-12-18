import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int H[] = new int[N];
    for(int i=0;i<N;i++){
      H[i] = sc.nextInt();
    }
    if(N == 1){
      System.out.println(1);
    }else{
      int min = (int)Math.abs((12 - H[0]*0.006) - A);
      for(int i=1;i<N;i++){
        if(Math.abs((12 - H[i]*0.006) - A)<min){
          min = (int)Math.abs(12 - H[i]*0.006);
          ar.add(i);
        }
      }
    }
    if(ar.size() == 0){
      System.out.println(1);
    }else{
      System.out.println(ar.get(ar.size()-1)+1);
    }

  }
}
