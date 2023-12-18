import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        long [] in2 = new long [a];
        long b = 0;
        long c;
        for(int i=0;i<a;i++){in[i] = sc.nextLong();
                             in2[in[i]-1]++;
                            }
        for(int i=0;i<a;i++){b+=in2[i]*(in2[i]-1)/2;                                                 
                            }
        for(int i=0;i<a;i++){c = in2[in[i]-1];
                             System.out.println(b-c+1);
                            }	
	}
}
