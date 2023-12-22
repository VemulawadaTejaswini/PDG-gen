import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[] pages;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		pages =  new int[n];
		for(int i = 0; i < pages.length; i++){
			pages[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(pages.length!=1){
			for(int i = 0; i < pages.length; i++){
				list.add(pages[i]);
				if(i == pages.length-1){
					if(pages[i] == pages[i-1]+1){
						System.out.println(list.get(0) + "-" + list.get(list.size()-1));
					}else{
						System.out.println(list.get(list.size()-1));
					}
				}else if(pages[i]+1 != pages[i+1]){
					System.out.print(list.get(0) + "-" + list.get(list.size()-1) + " ");
					list.clear();
				}
			}
		}else{
			System.out.println(pages[0]);
		}
	}

}