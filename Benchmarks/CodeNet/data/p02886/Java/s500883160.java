import java.util.Scanner;
public class Main {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       	int[] d = new int[n];
       	for(int i = 0 ; i < n ; i++ ){
        	d[i] = sc.nextInt();
        }
    	int s = 0;
       	for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < i ; j++ ){
            	s += d[i] * d[j];
            }
        }
        System.out.println(s);
  	}
}