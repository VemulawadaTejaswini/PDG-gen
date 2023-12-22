//Volume1-0140
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args){

		int     start,end,p;
		boolean flg;
		ArrayList<Integer> ans  = new ArrayList<Integer>();
		int[]              stop = {6,7,8,9,5,4,3,2,1,0};

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			ans.clear();
			start = sc.nextInt();
			end   = sc.nextInt();

			if   (start > end){p = -1;}
			else              {p =  1;}

			if(0 <= start && start <= 5){
				for(int i=start;i!=end;i+=p){
					ans.add(i);
				}
				ans.add(end);
			} else {
				flg = false;
				for(int i=0;end!=stop[i];i++){
					if(start==stop[i]){
						flg = true;
					}
					if(flg){
						ans.add(stop[i]);
					}
				}
				ans.add(end);
			}
			print(ans);
		}
	}

	private static void print(ArrayList<Integer> ans){
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i));
			if(i<ans.size()-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}