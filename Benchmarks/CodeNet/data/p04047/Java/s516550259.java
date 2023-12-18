import java.util.*;

class solution{
	public static void main(String srgs[]){
      Scanner in  = new Scanner (System.in);
      int n = in.nextInt() *2 ;
      int a[] = new int [n];
      for(int i= 0 ;i<n;i++){
      a[i] = in.nextInt();
      }
      Arrays.sort(a);
      int sum = 0;
      for(int i = 0 ;i<n;i+=2){
        sum+=a[i];
      }
      System.out.println(sum);
    }
}