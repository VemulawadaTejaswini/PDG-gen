import java.util.*;


public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()){
//		}
		int n = sc.nextInt();
		System.out.println(0);
		String leftStr = sc.next();
		if(leftStr.equals("Vacant")){
			return;
		}
		
		System.out.println(n-1);
		String rightStr = sc.next();
		if(rightStr.equals("Vacant")){
			return;
		}
		
		int mid, left = 0, right = n -1;
		while(left <= right){
			mid = (left + right) / 2;
			System.out.println(mid);
			String res = sc.next();
			if(res.equals("Vacant")) return;
			
			if((right - mid) % 2 == 1){
				if(res.equals(rightStr)){
					left = mid;
					leftStr = res;
				}
				else{
					right = mid;
					rightStr = res;
				}
			}
			else{
				if(res.equals(rightStr)){
					right = mid;
					rightStr = res;
				}
				else{
					left = mid;
					leftStr = res;
				}
			}
			
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
