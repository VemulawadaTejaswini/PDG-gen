import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();         
        int b = 0;
		int c = 0;
        int d;
		int [] in = new int [9];
        for(int i=0;i<a;i++){d = sc.nextInt()/400;
                             if(d<8){if(in[d]==0){in[d]=1;}}else{in[8]++;}
                            }
        for(int i=0;i<8;i++){b+=in[i];
                            }
        c = b+in[8];
        b = Math.max(b,1);
		System.out.println(b + " " + c);
	}
}
