import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long[] nums=new long[4];
    long f=0;
    for(int i=0;i<4;i++){
      nums[i]=sc.nextLong();
    }
    if(k>nums[0]){
      f=nums[0];
      if(k-nums[0]>nums[1]){
        f=f-(k-nums[0]-nums[1]);
      }else{}
    }else{
      f=k;
    }
    System.out.print(f);
  }
}