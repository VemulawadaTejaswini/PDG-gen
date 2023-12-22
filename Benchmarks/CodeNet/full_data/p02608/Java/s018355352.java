import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    for(int N=1;N<=n;N++){
          int ans=0;
    for(int i=1;i<=Math.sqrt(N);i++){
      for(int j=1;j<=Math.sqrt(N)-i;j++){
        for(int k=1;k<=Math.sqrt(N)-i-k;k++){
          if(i*i+j*j+k*k+i*j+j*k+k*i==N) ans+=1;
        }
      }
    }
    System.out.println(ans);
    }

  }  
}