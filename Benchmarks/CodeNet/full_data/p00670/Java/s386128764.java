import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int n = scan.nextInt();
        	int s = scan.nextInt();
        	if(n == 0 && s == 0){
        		break;
        	}
        	int[] r = new int[n];
        	for(int i = 0;i < n;i++){
        		r[i] = scan.nextInt();
        	}
        	Arrays.sort(r);
        	int count = 0;
        	for(int i = n-1;i > 0;i--){
        		for(int j = i - 1;j >= 0;j--){
        			if(r[i]+r[j] <= s){
        				break;
        			}
        			count++;
        		}
        	}
        	System.out.println(count);
        }
	}
}