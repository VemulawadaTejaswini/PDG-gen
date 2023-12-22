import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> S = new TreeSet<Integer>();
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int com = sc.nextInt();
			int x = sc.nextInt();
			if(com == 0){
				S.add(x);
				System.out.println(S.size());
			}else{
				if(S.contains(x)) System.out.println(1);
				else System.out.println(0);
			}
		}
	}
}

