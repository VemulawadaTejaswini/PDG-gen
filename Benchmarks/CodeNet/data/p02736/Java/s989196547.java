import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    String M =sc.next();
    String m[] =M.split("",0);
    int n[][] =new int[N][N];
    for(int k=0;k<N;k++){
      n[0][k]=Integer.parseInt(m[k]);}
    for(int i=1;i<N;i++){
      for(int j=0;j<N-i;j++){
        if(n[i-1][j]>=n[i-1][j+1]){n[i][j]=n[i-1][j]-n[i-1][j+1];}
             else{n[i][j]=n[i-1][j+1]-n[i-1][j];}
      }
    }
    System.out.println(n[N-1][0]);
  }
}