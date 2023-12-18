import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
  	int[] nums=new int[n];
  	int[] fnums=new int[n];
  	nums[0]=0;
  	for(int i=1;i<n;i++){
  		nums[i]=sc.nextInt();
  	}
  	int f=0;
  	for(int i=0;i<n;i++){
  		for(int j=i+1;j<n;j++){
  			if((i+1)==nums[j]){
  				fnums[i]++;
  			}else{
  				continue;
  			}
  		}
  		System.out.println(fnums[i]);
  	}
  }
}