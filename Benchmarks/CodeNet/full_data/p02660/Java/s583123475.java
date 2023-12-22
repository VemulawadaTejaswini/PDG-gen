import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int cnt=0;
    for(int i=2;i<=N;i++){
      if(N%i==0){
        cnt+=1;
        N/=i;
      }
    }
    
    System.out.println(cnt);
  }  
}