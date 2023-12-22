import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long[] nums=new long[4];
    long f=0;
    for(int i=0;i<4;i++){
      nums[i]=sc.nextLong();
    }
    if(nums[3]>nums[0]){
      f=nums[0];
      if(nums[3]-nums[0]>nums[1]){
        f=f-(nums[3]-nums[0]-nums[1]);
      }else{}
    }else{
      f=nums[3];
    }
    System.out.print(f);
  }
}
