import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long ab[][] = new long[n][3];
    long ans = 0;
    long max=-1;
    long s0=0;
    long s1=0;
    long s2=0;
    for (int i = 0;i<n ;i++ ) {
      ab[i][0]=scan.nextInt();
      ab[i][1]=scan.nextInt();
      ab[i][2]=ab[i][0]+ab[i][1];
    }
    for (int i = 0;i<n ;i++ ) {
      max=-1;
        for(int j = i;j<n;j++){
            if(ab[j][2]>max){
              s0=ab[j][0];
              s1=ab[j][1];
              s2=ab[j][2];
              ab[j][0]=ab[i][0];
              ab[j][1]=ab[i][1];
              ab[i][0]=s0;
              ab[i][1]=s1;
              ab[i][2]=s2;
              max=ab[j][2];
            }
        }
    }
    for (int i=0;i<n ;i++ ) {
      if (i%2==0) {
        ans+=ab[i][0];
      }else{
        ans-=ab[i][1];
      }
    }
    System.out.println(ans);
  }


}
