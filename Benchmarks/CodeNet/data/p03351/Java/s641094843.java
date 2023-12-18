import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] dis=new int[3];
    for(int i=0;i<3;i++){
      dis[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    if(dis[2]-dis[0]<=d){
      System.out.println("Yes");
    }else if(dis[1]-dis[0]<=d && dis[2]-dis[1]<=d){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}