import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(sc.hasNext()) {
        		int n= sc.nextInt();
        		int k = sc.nextInt();
        		int[] a= new int[n+1];
        		int min = 0;
        		for(int i=1;i<=n;i++) {
        			a[i] = sc.nextInt();
        			if(a[i]==1)
        				min = i;
        		}
        		
        		int cnt = 0;
        		int h = 0;
        		for(int i=min-1;i>=0;i--) {
        			a[i] = 1;
       				h++;
       				if(h==k-1) {
       					h=0;
       					cnt++;
       				}
        		}
       			h = 0;
       			for(int i=min+1;i<=n;i++) {
       				a[i] = 1;
       				if(h==0)cnt++;
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


