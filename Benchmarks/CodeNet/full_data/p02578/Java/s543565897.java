import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 人数
      	int[] height =new int[n];//身長
      	int max=0;//自分より前の最大身長
      	long sum=0;
      
      	for(int i=0;i<n;i++){
          height[i] = sc.nextInt();
        }
      
      	max=height[0];
      	for(int i=0;i<n;i++){
          if(max<=height[i]){
            max=height[i];
          }
          sum+=max-height[i];
        }
      	System.out.println(sum);
    } 
}





















