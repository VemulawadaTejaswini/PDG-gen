import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
        int count = 0;
		int ans = 0;
        for(int i=0;i<a-1;i++){if(in[i]>=in[i+1]){count++;}
                               else{ans = Math.max(ans,count);
                                   count=0;
                                   }                            
                              }       
		System.out.println(ans);
	}
}
