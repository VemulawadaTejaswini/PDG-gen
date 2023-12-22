import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    long[][] List=new long[N][2];
    for(int i=0;i<N;i++) for(int j=0;j<2;j++) List[i][j]=s.nextLong();

    
    long count=N*(N-1);
    for(int i=0;i<N-1;i++) for(int j=i+1;j<N;j++) if(i!=j) if(List[i][0]*List[j][0]+List[i][1]*List[j][1]==0){
      count-=1;
    }
    System.out.println(count%1000000007);


  }  
}