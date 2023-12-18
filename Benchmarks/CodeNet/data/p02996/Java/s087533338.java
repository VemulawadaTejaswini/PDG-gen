 import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        long [] in2 = new long [a];
        long t = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                             in2[i] = sc.nextLong()-in[i];
                            }
        Arrays.sort(in2,in);
		String s = "Yes";        
        for(int i=0;i<a;i++){if(in2[i]<t){s="No";break;
                                         }
                             else{t+=in2[i];}
                            }        
		System.out.println(s);
	}
}
