import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int sum = 0;
      
      if(a<k){
        sum = sum+1*a;
        k = k-a;
        if(b<k){
         	k = k-b;
          	sum = sum-1*k;
        }
      }else{
		sum = sum+1*k;
      }
      
      System.out.println(sum);
    }
}