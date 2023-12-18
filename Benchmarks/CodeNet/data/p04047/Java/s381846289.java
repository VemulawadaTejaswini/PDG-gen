import java.util.*;
public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n*2];
    for(int i=0;i<n*2;i++){
      nums[i]=sc.nextInt();
    }
    Arrays.sort(nums);
    int output=0;
    for(int i=0;i<n;i++){
      output+=nums[2*i+(n%2==0?0:1)];
    }
    System.out.println(output);
 
	}
}