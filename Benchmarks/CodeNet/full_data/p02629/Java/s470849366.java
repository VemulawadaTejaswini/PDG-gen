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
	int shou = (int)(N-now-1); //その桁の初めから何番目か
	int[] name = new int[keta];
	int ncheck = keta-1;
	while (shou != 0) {
	    name[ncheck] = shou % 26;
	    ncheck--;
	    shou = shou/26;
	}
	char[] abc = {'a','b','c','d','e','f','g','h','i',
		      'j','k','l','m','n','o','p','q','r',
		      's','t','u','v','w','x','y','z'};
	for (int i=0;i<keta;i++) {
	    System.out.print(abc[name[i]]);
	}
    }
}
