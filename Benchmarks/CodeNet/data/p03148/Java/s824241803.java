import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	Sushi[] sushi = new Sushi[N];
	long ans = 0;
	HashSet<Integer> set = new HashSet<Integer>();
	for(int i = 0; i<N; i++) {
	    sushi[i] = new Sushi(sc.nextInt(), sc.nextInt());
	    set.add(sushi[i].getKind());
	}
	Arrays.sort(sushi, new Comparator<Sushi>() {
		public int compare(Sushi s1, Sushi s2) {
		    return s1.getDelisious() - s2.getDelisious();
		}
	    }.reversed());

	boolean[] canSwap = new boolean[N];
	int canSwapCnt = 0;
	HashSet<Integer> canset = new HashSet<Integer>();
	for(int i = 0; i<K; i++) {
	    ans += sushi[i].getDelisious();
	    if(!canset.contains(sushi[i].getKind())) {
		canset.add(sushi[i].getKind());
		canSwap[i] = false;
	    }else {
		canSwap[i] = true;
		canSwapCnt++;
	    }

	}

	for(int i = K; i<N; i++) {
	    if(canset.contains(sushi[i].getKind())) {
		canSwap[i] = false;
	    }else{
		canSwap[i] = true;
	    }
	}

	if(canset.size() == set.size() || canset.size() == K) {
	    System.out.println(ans + set.size()*set.size());
	    return;
	}

	int size = canset.size();
	ans += size*size;
	long point = ans;
	for(int i = K-1; i>=0; i--) {
	    if(canSwap[i]) {
		int swapedIndex = searchCanSwap(i, canSwap);
		if(swapedIndex == -1) {
		    System.out.println(ans);
		    return;
		}
		canSwap[i] = false;
		canSwap[swapedIndex] = false;
		size++;
		point = point-sushi[i].getDelisious()+size*size-(size-1)*(size-1)+sushi[swapedIndex].getDelisious();
		ans = Math.max(ans, point);
	    }
	}
	System.out.println(ans);
    }

    static int searchCanSwap(int i, boolean[] canSwap) {
	for(int k = i+1; k<canSwap.length; k++) {
	    if(canSwap[k]) return k;
	}
	return -1;
    }
}
class Sushi {
    int kind;
    int delisious;
    public Sushi(int kind, int delisious) {
	this.kind = kind;
	this.delisious = delisious;
    }
    public int getKind() {
	return this.kind;
    }
    public int getDelisious() {
	return this.delisious;
    }
}