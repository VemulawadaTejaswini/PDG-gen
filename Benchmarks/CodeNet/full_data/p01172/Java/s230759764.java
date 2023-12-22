import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x==0 && y==0) break;
			
			ArrayList<Integer> list = new ArrayList<Integer>(); 
			int p = x;
			while(true){
				p %= y;
				if(p==0){
					System.out.println(list.size() + " 0");
					break;
				}else if(list.contains(p)){
					int ans = list.size() - list.indexOf(p);
					System.out.println(list.indexOf(p)+ " " + ans);
					break;
				}else{
					list.add(p);
					p *= 10;
				}
			}
		}	
	}
	
}