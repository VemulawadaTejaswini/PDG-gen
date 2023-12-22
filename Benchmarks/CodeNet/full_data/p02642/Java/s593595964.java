import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> lst = new ArrayList<Integer>();
		for(int i=0; i<N; i++){
			lst.add(sc.nextInt());
		}
		Collections.sort(lst);
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> blackList = new HashSet<Integer>();

		for(int i = N-1; i>=0; i--){
			int target = lst.get(i);
			if(blackList.contains(target)){
				continue;
			}
			int limit = (int) Math.floor(target/2);
			boolean flag = false;
			for(int j=1; j<limit+1; j++){
				if(lst.contains(j)){
					if((target%j)==0){
						flag = true;
						break;
					}
				}
			}
			if(!flag){
				if(set.contains(target)){
					set.remove(target);
					blackList.add(target);
				}else{
					set.add(target);
                }
			}
		}

		System.out.println(set.size());
		return;
	}
}