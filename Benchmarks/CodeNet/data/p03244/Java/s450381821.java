import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	HashSet<Integer> set = new HashSet<Integer>();
	HashMap<Integer, Integer> amap = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> bmap = new HashMap<Integer, Integer>();
	for(int i = 0; i<n/2; i++) {
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int anum = (amap.get(a)==null)?0:amap.get(a);
            int bnum = (bmap.get(b)==null)?0:bmap.get(b);
	    amap.put(a,anum+1);
	    bmap.put(b,bnum+1);
	    set.add(a);
	    set.add(b);
	}
	if(set.size()==1) {
	    System.out.println(n/2);
	    return;
	}
	int amax = 0;
	int amaxI = 0;
	int bmax = 0;
	int bmaxI = 0;
	for(int a: amap.keySet()) {
	    if(amap.get(a)>amax){
		amax = amap.get(a);
		amaxI = a;
	    }
	}
	for(int b: bmap.keySet()) {
	    if(bmap.get(b)>bmax){
		bmax = bmap.get(b);
                bmaxI = b;
	    }
	}

	if(amaxI != bmaxI) {
	    System.out.println((n/2 - amax) + (n/2 - bmax));
	    return;
	}
	if(amax>= bmax) {
	    int upper = bmaxI;
	    bmax = 0;
	    bmaxI = 0;
	    for(int b: bmap.keySet()) {
		if(bmap.get(b)>bmax && upper!=b){
		    bmax = bmap.get(b);
		    bmaxI = b;
		}
	    }
	    System.out.println((n/2 - amax) + (n/2 - bmax));
	    return;
	}
	int aupper = amaxI;
	amax = 0;
	amaxI = 0;
	for(int a: amap.keySet()) {
	    if(amap.get(a)>amax && aupper!=a){
		amax = amap.get(a);
		amaxI = a;
	    }
	}

	System.out.println((n/2 - amax) + (n/2 - bmax));

    }
}