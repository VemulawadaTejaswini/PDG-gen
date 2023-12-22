import java.util.Arrays;
import java.util.Scanner;
class Player implements Comparable<Player>{
	int party;
	int num;
	String time;
	Player(int p,int n,String t){
		this.party = p;
		this.num = n;
		this.time = t;
	}
	/*@Override
	public int compareTo(Player p) {
		return this.time.compareTo(p.num);
	}
	*/
	public String getTime() {
        return time;
    }
	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
	
		return this.time.compareTo(((Player) o).getTime());
	}
	
}

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Player[] person = new Player[24];
		int[] rank1 = new int[8];
		int[] rank2 = new int[8];
		int[] rank3 = new int[8];
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 8;j++){
				person[i*8+j] = new Player(i,sc.nextInt(),sc.next());
			}
		}
		Arrays.sort(person);
		for(int i = 0;i < 24;i++){
			if(person[i].party == 0){
				rank1[cnt1] = i;
				cnt1++;
			}else if(person[i].party == 1){
				rank2[cnt2] = i;
				cnt2++;
				
			}else{
				rank3[cnt3] = i;
				cnt3++;
			}
		}
		for(int j = 0;j < 2;j++){
			System.out.println(person[rank1[j]].num+" "+person[rank1[j]].time);
			person[rank1[j]].time = "999";
		}
		for(int j = 0;j < 2;j++){
			System.out.println(person[rank2[j]].num+" "+person[rank2[j]].time);
			person[rank2[j]].time = "999";
		}
		for(int j = 0;j < 2;j++){
			System.out.println(person[rank3[j]].num+" "+person[rank3[j]].time);
			person[rank3[j]].time = "999";
		}
		Arrays.sort(person);
		for(int j = 0;j < 2;j++){
			System.out.println(person[j].num+" "+person[j].time);
		}
		
	}
}