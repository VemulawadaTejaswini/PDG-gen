import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  N=sc.nextInt();
    long  As[]=new long[N];
    long  Bs[]=new long[N-1];
for (int i=0;i<N ;i++ ) {
  As[i]=sc.nextLong()%1000000007;
}
long Sum=0;
for(int k=0;k<N-1;k++){
  for(int l=k+1;l<N;l++){
    Bs[k]+=As[l];
  }
}
for(int i=0;i<N-1;i++){
     Sum+=As[i]*Bs[i]%1000000007;

}
System.out.println(Sum%1000000007);
}
}
