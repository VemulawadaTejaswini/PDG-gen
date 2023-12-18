import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int teki = sc.nextInt();
		int waza = sc.nextInt();
		List<Integer> hp = new ArrayList<Integer>();
		for (int i = 0; i < teki; i++){
			hp.add(sc.nextInt());
		}
		Collections.sort(hp, Collections.reverseOrder());
      	for(int hoge : hp){
         System.out.println(hoge); 
        }
		int ret = 0;
		for(int i = 0; i < hp.size(); i++){
			ret += hp.get(i);
		}
		
		System.out.print(ret);
	}
}