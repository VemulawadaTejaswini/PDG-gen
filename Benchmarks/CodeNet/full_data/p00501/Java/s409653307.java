import java.util.Scanner;

public class Main {
	
	public  int check(String name, String board){
		int i, j, k, space, next;
		boolean flag = false;
		char[] nameC = name.toCharArray();
		char[] boardC = board.toCharArray();
		
		for(i=0; i<board.length(); i++){
			if(nameC[0] == boardC[i]){
				for(j=i; j<board.length(); j++){
					if(nameC[1] == boardC[j]){
						space = j - i;
						for(k=2, next=j+space; next<board.length(); next+=space, k++){
							flag = false;
							if(nameC[k] == boardC[next]){
								flag = true;
								if(k==name.length()-1)return 1;
							}
							if(flag == false)break;
						}		
					}
				}
			}
		}
		return 0;
	}
	
	void doIt(){
		Scanner sc = new Scanner(System.in);
		int i, cnt = 0;
		int N = sc.nextInt();
		String name = sc.next();
		String[] board = new String[N];
		Main m = new Main();
		for(i=0; i<N; i++)board[i] = sc.next();
		
		for(i=0; i<N; i++){
			cnt += m.check(name, board[i]);
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args){
		new Main().doIt();	
	}
}