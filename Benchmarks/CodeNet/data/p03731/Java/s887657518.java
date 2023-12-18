import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int t = sc.nextInt();
        int[] tt = new int[n];
		int count = 0;
		for (int i=0;i<n;i++){
        	tt[i] = sc.nextInt();
        }
		for (int j=1;j<n;j++){
        	if (tt[j]-tt[j-1]>=t){
            	count+=t;
            }else{
            	count+=tt[j]-tt[j-1];
            }
        } 
		System.out.print(t+count);
    }
}