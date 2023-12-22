import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] temp = new int[2001];
        int[] ans = new int[4001];
        
        for(int i=0;i<=1000;i++){
        	for(int j=0;j<=1000;j++){
        		temp[i+j]++;
        	}
        }
        for(int i=0;i<=2000;i++){
        	for(int j=0;j<=2000;j++){
        		ans[i+j]+=temp[i]*temp[j]; 
        	}
        }
        
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	System.out.println(ans[n]);
        }
    }
}