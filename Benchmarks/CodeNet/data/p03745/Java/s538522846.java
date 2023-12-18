import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      int cnt = 1;
      int flag = 0;
      for(int i = 0;i < n-1;i++){
      	if(a[i]<a[i+1]){
        	if(flag==-1){
            	cnt++;
                flag = 0;
            }else if(flag==0){
            	flag = 1;
            }
        }else if(a[i]>a[i+1]){
        	if(flag==1){
            	cnt++;
                flag = 0;
            }else if(flag==0){
            	flag = -1;
            }
        }
      }
      System.out.println(cnt);
    }
}