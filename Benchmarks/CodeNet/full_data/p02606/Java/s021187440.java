import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int L=s.nextInt();
    int R=s.nextInt();
    int d=s.nextInt();
    int ans=0;
    for(int i=L;i<=R;i++){
      if(i%d==0) ans+=1;
    }
    System.out.println(ans);

  }  
}