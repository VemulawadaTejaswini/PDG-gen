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
		Collections.sort(hp, Collections.reverseOrder());
		for(int i = 0; i < waza ; i++){
          	ret -= hp.get(0);
			hp.remove(hp.get(0));
		}
		System.out.print(ret);
	}
}