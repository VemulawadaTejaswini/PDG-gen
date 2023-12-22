import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){

	int i;
	int k;
	int l;
	int answer;
	int[] p = new int[1000];
	putP(p);

	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    answer = 0;
	    i=0;
	    if(n != 0){
		for(; i<p.length; i++){
		    for(k=i; k<p.length; k++){
			if(p[i]+p[k] == n) answer++;
		    }
		}
		System.out.println(answer);
	    }
	}
    }

    static void putP(int[] p){
	int i=0;
	int k=2;
	while(i<p.length){
	    if(isPrime(k)){
		p[i] = k;
		i++;
	    }
	    k++;
	}
    }
    static boolean isPrime(int k){
	int l = (int)Math.sqrt(k);
	int c = 0;
	for(; l>1; l--){
	    if(k%l==0) c++;
	}
	if(c == 0) return true;
	return false;
    }
}