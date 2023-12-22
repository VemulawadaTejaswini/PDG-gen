import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] in = new int[s.nextInt()*2];
		for(int i=0;i<in.length;i++)
			in[i]=i+1;
		int b;
		for(int i=s.nextInt();i>0;--i)
			if((b=Integer.parseInt(s.next()))==0)
				riffle(in);
			else
				cut(in, b);
		System.out.println(Arrays.toString(in).replaceAll("[^0-9,]","").replaceAll(",","\n"));
	}
	static void cut(int[] in,int k) {
		int[] b = Arrays.copyOfRange(in, 0, k);
		for(int i=0;i<in.length-b.length;i++)
			in[i]=in[i+b.length];
		for(int i=0;i<b.length;i++)
			in[in.length-b.length+i]=b[i];
	}
	static void riffle(int[] in) {
		int[] b = Arrays.copyOfRange(in, 0, in.length/2);
		int[] bb= Arrays.copyOfRange(in, in.length/2, in.length);
		for(int i=0;i<b.length;i++) {
			in[i*2  ]=b [i];
			in[i*2+1]=bb[i];
		}
	}
}