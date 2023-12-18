import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num[]=new int[3];
    int sum=0,max=5,min=7;
    for(int i=0;i<3;i++){
      num[i]=sc.nextInt();
      sum+=num[i];
      max=Math.max(max,num[i]);
      min=Math.min(min,num[i]);
    }    
    if((sum==17)&&(max==7)&&(min==5)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}