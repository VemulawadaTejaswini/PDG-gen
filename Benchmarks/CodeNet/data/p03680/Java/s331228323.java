import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int num=0;
    boolean isOK=false;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    sc.close();
    for(int i=0;i<n;i++){
      if(a[num]==2){
        System.out.println(i+1);
        isOK=true;
        break;
      }else{
        num=a[num]-1;
      }
    }
    if(isOK==false){
      System.out.println(-1);
    }
  }
}