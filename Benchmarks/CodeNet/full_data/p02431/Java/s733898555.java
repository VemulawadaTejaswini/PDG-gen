import java.util.*;

class Main{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i = 0; i < q; i++){
			int op = sc.nextInt();
			if(op == 0){
				int x = sc.nextInt();
				A.add(x);
			}else if(op == 1){
				int p = sc.nextInt();
				System.out.println(A.get(p));
			}else A.remove(A.size() - 1);
		}
	}
};

