import java.util.*;
public class Main {
private static int a[];
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		a = new int[n];
		int[] a2 = new int[n];
		for (int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
		int s=1;
        int s1 = s;
        a2[0]=1;
		int cnt = 1;
		int buf=0;
		for (int i=0; i<n;i++){
			int s2 = teleporter(s1);
          
			if (a2[s2-1]>0) {
				buf=a2[s2-1]-1;
				cnt=i+1-buf;
				break;
			} else {
				a2[s2-1]=i+2;				
			}
          s1=s2;
		}
    	k = k-buf;
    	int mod = (int)(k % n);
    	
   	int w1=mod;
    for (int i=0;i<mod+1;i++){
		w1=teleporter(w1);

	}
    System.out.println(w1);
  }
	private static int teleporter(int f){
		return a[f-1];
	}
}



