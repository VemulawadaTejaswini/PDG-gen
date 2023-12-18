import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();

		ArrayList<Long> qtyList = new ArrayList<>();
		qtyList.add(N);
		qtyList.add(0l);
		qtyList.add(0l);
		qtyList.add(0l);
		qtyList.add(0l);
		qtyList.add(0l);

		long time = 0;
		while(qtyList.get(5) != N){
			List<Long> tmpList = (ArrayList<Long>)qtyList.clone();
			qtyList.set(0, tmpList.get(0)-getMoveQty(tmpList.get(0), A));
			qtyList.set(1, tmpList.get(1)-getMoveQty(tmpList.get(1), B) + getMoveQty(tmpList.get(0), A));
			qtyList.set(2, tmpList.get(2)-getMoveQty(tmpList.get(2), C) + getMoveQty(tmpList.get(1), B));
			qtyList.set(3, tmpList.get(3)-getMoveQty(tmpList.get(3), D) + getMoveQty(tmpList.get(2), C));
			qtyList.set(4, tmpList.get(4)-getMoveQty(tmpList.get(4), E) + getMoveQty(tmpList.get(3), D));
			qtyList.set(5, tmpList.get(5) + getMoveQty(tmpList.get(4), E));
			time++;
		}

		System.out.println(time);


	}

	static long getMoveQty(long rest, long move){
		long ans =  0l;
		if(rest >= move){
			ans = move;
		}else{
			ans = rest;
		}
		return ans;
	}

}
