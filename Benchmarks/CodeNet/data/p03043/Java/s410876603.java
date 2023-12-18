import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int count = 0;
      int point = 0;
      double per = 0;
      for(int i = 1;i <= n;i++){
        point = i;
      	while(point < k){
        	count++;
            point *= 2;
        }
        per += (1/n)*Math.pow(0.5,count);
        count = 0;
      }
      System.out.println(per);
    }
}