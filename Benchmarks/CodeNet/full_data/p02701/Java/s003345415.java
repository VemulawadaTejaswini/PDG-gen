import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<String> S = new ArrayList<>();
		List<String> Ss = new ArrayList<>();
		boolean flg = false;
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			S.add(sc.next());
			Ss.add(S.get(i));
		}
		for(int i=0;i<S.size();i++) {
			for(int j=0;j<Ss.size();j++) {
				if (S.get(i).equals(Ss.get(j))){
					if(i != j) {
						Ss.remove(j);				
						flg = true;
					}
				}
			}
		}
		if(flg) {
			System.out.println(Ss.size()+1);			
		}else {
			System.out.println(Ss.size());			
		}
	}
}