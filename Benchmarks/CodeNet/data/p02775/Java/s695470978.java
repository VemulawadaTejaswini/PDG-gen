import java.util.*;
public class Main {
  //public static String text;
  public static int[] number;
  public static int min = Integer.MAX_VALUE;
  public static int[] sum;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int n = s.length();
      	number = new int[n];
        sum = new int[n];
      	for(int i=0;i<n;i++){
          number[i] = (int)s.charAt(i)-48;
          if( number[i] < 6 ){
            sum[i] = number[i];
          }else{
            sum[i] = 11 - number[i];
          }
          if( i > 0 ){
            sum[i] += sum[i-1];
          }
        }
      	System.out.println(sum[n-1]);
	}
}