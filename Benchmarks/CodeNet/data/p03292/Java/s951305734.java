import java.util.*;


class Main{
  
      public static Long gcd(Long num1,Long num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
  
  
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      int[] a = new int[3];   
       for(int i=0;i<3;i++){
   		a[i] = sc.nextInt();
    }
      Arrays.sort(a);
      
      int ans = a[1] - a[0] + a[2] - a[1];
      System.out.println(ans);
	}
}
