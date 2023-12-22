import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	ArrayList<Integer> list = new ArrayList<>();
      	for(int cnt = 0;cnt < n;cnt++){
        	list.add(Integer.parseInt(sc.next()));
        }
      	Collections.sort(list);
      	int total = 0;
      	for(int cnt = 0;cnt < k;cnt++){
        	total += list.get(cnt);
        }
      	System.out.println(total);
	}
}