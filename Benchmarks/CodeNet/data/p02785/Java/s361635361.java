import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int teki = sc.nextInt();
		int waza = sc.nextInt();
      	int ret = 0;
      	if (teki <= waza){
        	System.out.println(0);
          	return;
        }
		List<Integer> hp = new ArrayList<Integer>();
		for (int i = 0; i < teki; i++){
			hp.add(sc.nextInt());
          	ret += hp.get(i);
		}
		for(int i = 0; i < waza ; i++){
          	Optional<Integer> max = hp.stream().max((a,b) -> a.compareTo(b));
          	ret -= max.get();
			hp.remove(hp.indexOf(max.get()));
		}
		System.out.print(ret);
	}
}