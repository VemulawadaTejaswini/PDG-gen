import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String t_card, h_card;
		int t_cnt = 0, h_cnt = 0, com;
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++){
			t_card = sc.next();
			h_card = sc.next();
			com = t_card.compareTo(h_card);
			if(com==0){ t_cnt++; h_cnt++; }
			else if(com>0) t_cnt+=3;
			else h_cnt+=3;
		}
		System.out.println(t_cnt + " " + h_cnt);
	}
}