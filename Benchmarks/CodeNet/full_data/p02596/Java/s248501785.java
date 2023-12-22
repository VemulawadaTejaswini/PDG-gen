import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long k=sc.nextLong();
    if(k==7){
      System.out.println(1);
      return;
    }
    if(k%7==0){
      k=k/7;
    }
    k=k*9;
    long ai=10;
    for(int i=1;i<80000000;i++){
      if(ai==1){
        System.out.println(i);
        return;
      }
      //System.err.print(ai+" ");
      ai=(ai*10)%k;
    }
    System.out.println(-1);
  }
}