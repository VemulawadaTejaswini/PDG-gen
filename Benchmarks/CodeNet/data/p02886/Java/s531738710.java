import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int d[]=new int[N];
    int total=0;
    for(int i = 0 ; i<N ; i++){
      d[i] = sc.nextInt();
    }

    for(int i = 0 ; i<N ; i++){
      for(int j = 1 ; j<N-i ; j++){
        int n=d[i]+d[i+j];
        total=total+n;
      }
    }
    System.out.println(total);


  }
}
