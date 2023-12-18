import java.util.*;
import java.io.*;

class Cake implements Comparable<Cake>{
        long but,yum,pop;
        
        public Cake(long b, long y, long p){
        	but = b;
        	yum = y;
        	pop = p;
        }
        
        public long value(){
        	return but + yum + pop;
        }
        
        public int compareTo(Cake another){
            long v1 = this.value();
            long v2 = another.value();
            if(v1==v2) return 0;
            if(v1>v2) return 1;
            return -1;
        }
}

public class Main {
    
    public static long chooseCake(Cake[] cakes, int eat){
    	Arrays.sort(cakes);
    	long ans = 0;
    	for(int i=0;i<eat;i++){
    	    ans += cakes[(cakes.length)-1-i].value();
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Cake[] ppp = new Cake[N];
        Cake[] ppn = new Cake[N];
        Cake[] pnp = new Cake[N];
        Cake[] pnn = new Cake[N];
        Cake[] npp = new Cake[N];
        Cake[] npn = new Cake[N];
        Cake[] nnp = new Cake[N];
        Cake[] nnn = new Cake[N];
        for(int n=0;n<N;n++){
        	long b = sc.nextLong();
        	long y = sc.nextLong();
        	long p = sc.nextLong();
        	ppp[n] = new Cake( b, y,-p);
        	ppn[n] = new Cake( b, y, p);
        	pnp[n] = new Cake( b,-y,-p);
        	pnn[n] = new Cake( b,-y, p);
        	npp[n] = new Cake(-b, y,-p);
        	npn[n] = new Cake(-b, y, p);
        	nnp[n] = new Cake(-b,-y,-p);
        	nnn[n] = new Cake(-b,-y, p);
        }
        

        long ans = chooseCake(ppp,M);
        if (chooseCake(ppn,M) > ans) ans = chooseCake(ppn,M);
        if (chooseCake(pnp,M) > ans) ans = chooseCake(pnp,M);
        if (chooseCake(pnn,M) > ans) ans = chooseCake(pnn,M);
        if (chooseCake(npp,M) > ans) ans = chooseCake(npp,M);
        if (chooseCake(npn,M) > ans) ans = chooseCake(npn,M);
        if (chooseCake(nnp,M) > ans) ans = chooseCake(nnp,M);
        if (chooseCake(nnn,M) > ans) ans = chooseCake(nnn,M);
        
        System.out.println(ans);
        
    }
}