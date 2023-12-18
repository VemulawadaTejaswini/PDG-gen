import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	Dish[] da = new Dish[N];
	Dish[] db = new Dish[N];
	int[] aa = new int[N];
	int[] ab = new int[N];
	for(int i = 0; i<N; i++) {
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    da[i] = new Dish(i, a);
	    db[i] = new Dish(i, b);
	    aa[i] = a;
	    ab[i] = b;
	}
	Arrays.sort(da, new Comparator<Dish>() {
		public int compare(Dish d1, Dish d2) {
		    return d1.getA() - d2.getA();
		}
	    }.reversed());

	Arrays.sort(db, new Comparator<Dish>() {
		public int compare(Dish d1, Dish d2) {
                    return d1.getA() - d2.getA();
                }
            }.reversed());

	HashSet<Integer> set = new HashSet<Integer>();
	long ans = 0;
	int pa = 0;
	int pb = 0;
	boolean isT = true;
	while(pa<N || pb<N) {
	    while(pa<N && set.contains(da[pa].getID())) pa++;
	    while(pb<N && set.contains(db[pb].getID())) pb++;
	    if(pa>=N && pb>=N) break;
	    int a = (pa<N)?da[pa].getA(): 0;
            int b = (pb<N)?db[pb].getA(): 0;
	    long max = 0;
	    if(isT) {
		if(a >= b) {
		    int id = da[pa].getID();
		    set.add(id);
		    max = (isT)?da[pa].getA(): ab[id];

		} else {
		    int id = db[pb].getID();
		    set.add(id);
		    max = (isT)?aa[id]: db[pb].getA();

		}
	    }else {
		if(a > b) {
                    int id = da[pa].getID();
                    set.add(id);
                    max = (isT)?da[pa].getA(): ab[id];

		} else {
                    int id = db[pb].getID();
                    set.add(id);
                    max = (isT)?aa[id]: db[pb].getA();

		}
	    }
	    if(isT) {
		ans += max;
		isT = false;
	    }else {
		isT = true;
		ans -= max;
	    }

	}
	System.out.println(ans);

    }
}
class Dish {
    int id;
    int a;

    public Dish(int id, int a) {
	this.id = id;
	this.a = a;
    }
    public int getID() {
	return this.id;
    }
    public int getA() {
	return this.a;
    }

}