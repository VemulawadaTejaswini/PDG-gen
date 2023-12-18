import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
	}
	int cout = 0;
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	for(int i = 0; i < n; i++) {
		if(hm.containsKey(a[i])) {
			cout = hm.get(a[i]) +1;
			hm.put(a[i], cout);
		} else {
			hm.put(a[i], 1);
		}
	}
	cout = 0;
	for(int key : hm.keySet()) {
		if(hm.get(key) >= key) {
			cout +=  hm.get(key) - key;
		} else {
			cout += hm.get(key);
		}
	}
	System.out.println(cout);
}
}
