import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
		    int l = 0;
		    double d = 0;
		    int a = 0;
		    int out = 0;
		    String[] c = s.next().split(",");
		    int[] in = new int[12];
		    for(int i=0 ; i<12 ; i++)
			in[i] = Integer.parseInt(c[i]);
		    for(int i=0 ; i<10 ; i++)
			l+=in[i];
		    d = (double) l*in[10]/(in[10]+in[11]);
		    while(d>a){
			a+=in[out];
			out++;
		        System.out.println(a);
		    }
		    System.out.println(out + " " + d + " " + l);
		}
	}
}