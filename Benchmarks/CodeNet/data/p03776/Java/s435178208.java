import java.util.*;
public class Main {
    public static long com2(long x,long y){
        if(y==0 || y==x) return 1;
        if(x < y) return 0;
        return com2(x-1,y-1)+com2(x-1,y);
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		long [] in = new long [a];
        double d = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
		Arrays.sort(in);
        long e = 0;
        long f = 0;
        long g = 0; 
        for(int i=0;i<b;i++){d+=in[a-i-1];                                               
                            }
        d/=b;
        for(int i=0;i<a;i++){if(in[i]==in[a-b]){f++;if(i>=a-b){g++;}}
                            }
       
        if(d==in[a-1]){for(int i=b;i<=c;i++){e+=com2(f,i);}}
        else{e=com2(f,g);}
		System.out.println(d);
        System.out.println(e);
	}
}
