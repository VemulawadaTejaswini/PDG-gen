import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int cp[] = new int[k];
		int i, idx, min, max;

		for(i=0; i<n; i++){
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		Collections.reverse(al);
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()){
			idx=0;
			min=Integer.MAX_VALUE;
			for(i=0; i<k; i++){
				if(min>cp[i]){
					min=cp[i];
					idx=i;
				}
			}
			cp[idx]+=it.next();
		}
		max=0;
		for(i=0; i<k; i++){
			if(max<cp[i]){
				max=cp[i];
			}
		}
		System.out.println(max);
	}
}