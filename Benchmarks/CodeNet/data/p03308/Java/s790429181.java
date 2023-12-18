import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int[n];
      	int max = 0;
      	for(int i=0; i<n; i++){
        	a[i] = sc.nextInt();
        }
      	for(int j=0; j<n; j++){
        	for(int k=0; k<=j; k++){
            	if(Math.abs(a[j]-a[k])>max){
                	max = Math.abs(a[j]-a[k]);
                }
            }
        }
      	System.out.println(max);
    }
}