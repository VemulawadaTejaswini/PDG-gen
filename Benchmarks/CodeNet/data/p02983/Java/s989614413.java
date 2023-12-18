import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      int L=sc.nextInt();
      int R=sc.nextInt();
      int cal=0;
      int ans=10000000000;
      if(R-L>=2019){
        System.out.println(0);
      }else{
        for(int i=L;i<R;i++){
          for(int j=i+1;j<=R;j++){
            cal=(i*j)%2019;
            ans=Math.min(ans,cal);
          }
        }
      }
      System.out.println(ans);





    }
  }
}