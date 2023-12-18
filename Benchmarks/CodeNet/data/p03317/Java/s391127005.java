
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(sc.hasNext()) {
        		int n= sc.nextInt();
        		int k = sc.nextInt();
        		int[] a= new int[n+1];
        		int min = 0;
        		for(int i=0;i<n;i++) {
        			a[i] = sc.nextInt();
        			if(a[i]==1)
        				min = i;
        		}
        		
        		int cnt = 0;
        		int h = 0;
        		cnt = min/(k-1);
        		if(min%(k-1) != 0) {
        			min = min+k-1-(min%(k-1));
        			cnt++;
        		}
        		System.out.println(min);
       			for(int i=min+1;i<n;i++) {
       				if(h==0) {
       					cnt++;
       				}
       				a[i] = 1;
       				h++;
       				if(h==k-1) {
       					h=0;
       				}
        		}
       			System.out.println(cnt);
        	}
        }
    }
}


