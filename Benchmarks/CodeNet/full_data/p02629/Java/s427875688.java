import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long N = sc.nextLong();
	long now = 0;
	int keta = 1;
	while(N > now) {
	    now = now + (long)Math.pow(26,keta);
	    keta++;
	}
	keta--;
	now = now - (long)Math.pow(26,keta);
	long shou = N-now-1; //その桁の初めから何番目か
	long[] name = new long[keta];
	for (int i=keta-1;i>=0;i--) {
	    name[i] = shou % 26;
	    shou = shou/26;
	}
	char[] abc = {'a','b','c','d','e','f','g','h','i',
		      'j','k','l','m','n','o','p','q','r',
		      's','t','u','v','w','x','y','z'};
	for (int i=0;i<keta;i++) {
	    System.out.print(abc[(int)name[i]]);
	}
    }
}
