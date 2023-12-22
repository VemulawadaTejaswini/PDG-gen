import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int d = sc.nextInt();
			if(w==0 && d==0) break;
			int sum = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<w;i++){
				int h = sc.nextInt();
				sum += h;
				list.add(h);
			}
			for(int i=0;i<d;i++){
				int h = sc.nextInt();
				if(list.contains(h)) list.remove(list.indexOf(h));
				else sum += h;
			}
			System.out.println(sum);
		}
	}
}