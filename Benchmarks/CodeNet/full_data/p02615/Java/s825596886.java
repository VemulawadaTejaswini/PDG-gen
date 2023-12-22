import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        long ans = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }     
		Arrays.sort(in); 
        long max = in[a-1];
        int count = 1;
        for(int i=a-2;i>=0;i--){ans+=max;count++;
                               if(count==2){max=Math.max(in[i],in[i+1]);count=0;}
                               }
        System.out.println(ans);
	}
}