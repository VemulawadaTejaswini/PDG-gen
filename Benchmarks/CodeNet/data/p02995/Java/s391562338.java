import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long[] nums=new long[4];
  	for(int i=0;i<4;i++){
  		nums[i]=sc.nextLong();
  	}
  	long f=(nums[1]-(nums[1]/nums[2]+nums[1]/nums[3]-nums[1]/nums[2]/nums[3]))-(nums[0]-1-((nums[0]-1)/nums[2]+(nums[0]-1)/nums[3]-(nums[0]-1)/nums[2]/nums[3]));
  	System.out.print(f);
  }
}