import java.util.Scanner;
public class queue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] b = new int[n+1];
		    for(int i=1;i<n;i++) {
		    	b[i]=sc.nextInt();
		    }
		    b[0]=b[n]=1000000;
		    int ans = 0;
		    for(int i=0;i<n;i++){
		      ans = ans+Math.min(b[i],b[i+1]);
		    }
		    System.out.println(ans);
		  }
		}
		           

