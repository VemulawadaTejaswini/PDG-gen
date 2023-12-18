import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        long b = 0;
        long ans = 0;
        long c = 0;
        long d = 0;
		if(a%2==0){long [] in = new long [a];
                   
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                             if(i%2==0){c+=in[i];}else{d+=in[i];}
                            }
		ans = Math.max(c,d);      
                  }
        else{long [] in = new long [a+1]; long sum = 0;
             for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                             sum+=in[i];
                             if(i%2==0){c+=in[i];}else{d+=in[i];}
                            }
         if(c<=d){ans = sum-c;}
             else{Arrays.sort(in);
                 ans = sum-d+in[a]-in[0];}                                      
            }
		System.out.println(ans);
	}
}
