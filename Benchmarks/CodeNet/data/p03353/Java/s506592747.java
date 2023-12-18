import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		ArrayList<String> arr = new ArrayList<>();
		int K = sc.nextInt();

		for(int t=1;t<=K;t++){
			for(int s=0;s<st.length()-t+1;s++){
				arr.add(st.substring(s,s+t));
			}
		}

		Set<String> set = new HashSet<>(arr);
		List<String> list = new ArrayList<>(set);

		Collections.sort(list);

		System.out.println(list.get(K-1));

	}
}