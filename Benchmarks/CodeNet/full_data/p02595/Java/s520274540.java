import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    long D=s.nextLong();
    D=D*D;
    int ans=0;
    long[][] point=new long[N][2];
    for(int i=0;i<N;i++){
      for(int j=0;j<2;j++){
        point[i][j]=s.nextLong();
        point[i][j]=point[i][j]*point[i][j];
      }
      if (point[i][0]+point[i][1]<=D){ans+=1;}
    }
    
    
    System.out.println(ans);
  }  
}