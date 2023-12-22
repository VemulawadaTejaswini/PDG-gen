import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		
		for(int i=0; i<N; i++){
			list.add(Integer.parseInt(sc.next()));
		}
		
		int count =0;
		for(int i=0; i<list.size(); i++){
			boolean s = true;
			for(int j=0; j<list.size();j++){
				if(i==j)continue;
				if(list.get(i) == list.get(j) || list.get(i)%list.get(j)==0) s = false; 
			}
			if(s)count++;
		}
		System.out.println(count);
		
	}
}
