import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N = sc.nextInt(),max=0;
    String B[] = new String[N];
    for(int i=0; i<N; i++) {
      B[i]=sc.next();
    }
    
    int T = sc.nextInt();
    String R[] = new String[T];
    for(int j=0; j<T; j++) {
      R[j]=sc.next();
    }
    
    for(int k=0; k<N; k++) {
      int n=0;
      for(int l=0; l<N; l++) {
        if(B[k].equals(B[l])) n++;
      }
      for(int m=0; m<T; m++) {
        if(B[k].equals(R[m])) n--;
      }
      if(n>max) max=n;
    }
    System.out.println(max);
  }
}