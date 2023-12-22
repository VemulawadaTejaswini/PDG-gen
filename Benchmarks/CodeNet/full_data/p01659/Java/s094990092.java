import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(list.size()==0){
				list.add(a);
				cnt++;
			}else{
				while(a<list.get(list.size()-1)){
					list.remove(list.size()-1);
				}
				if(!list.contains(a)){
					list.add(a);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}	
}