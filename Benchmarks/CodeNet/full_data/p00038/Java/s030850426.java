import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static boolean checkFourCard(int[] group){
		boolean flag = false;
		for(int i=1; i<group.length; ++i){
			if(group[i] == 4){
				flag = true;
			}
		}
		return flag;
	}
	
	private static boolean checkFullHouse(int[] group){
		boolean two=false, three=false;
		
		for(int i=1; i<group.length; ++i){
			if(group[i] == 2){
				two = true;
			}else if(group[i] == 3){
				three = true;
			}
		}
		if(two && three){
			return true;
		}else{
			return false;
		}
	}
	
	private static boolean checkStraight(int[] group){
		boolean flag = false;
		int count = 0;
		
		for(int i=1; i<group.length; ++i){
			if(group[i] == 1){
				//またいだ回数
				int over = 0;
				for(int j=i; j<i+5; ++j){
					over += j/group.length;
					if(over > 1){	//2まで行ったら、
						return false;
					}
					
					int num = j%13;
					if(num == 0){ num = 13; }
					if(group[num] == 1){
						++count;
					}else{
						count = 0;
						break;
					}
				}
				if(count == 5){
					flag = true;
					break;
				}
			}
		}
		
		return flag;
	}
	private static boolean checkThreeCard(int[] group){
		boolean flag = false;
		
		for(int i=1; i<group.length; ++i){
			//main で else if やっているから大丈夫だけど、full house 誤認防止
			if(group[i] == 2){
				return false;
			}else if(group[i] == 3){		//four cardもfalseで帰る。
				flag = true;
			}
		}
		
		return flag;
	}
	
	private static boolean checkTwoPair(int[] group){
		boolean flag = false;
		
		for(int i=1; i<group.length; ++i){
			if(flag){		//one pair あった上で見つかったら、
				if(group[i] == 2){
					return true;
				}
			}
			if(group[i] == 2){
				flag = true;
			}
		}
		
		return false;
	}
	
	private static boolean checkOnePair(int[] group){
		boolean flag = false;
		
		for(int i=1; i<group.length; ++i){
			if(flag){		//one pair あった上で見つかったら、
				if(group[i] == 2 || group[i] == 3){
					flag = false;
				}
			}
			if(group[i] == 2){
				flag = true;
			}
		}
		
		return flag;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int hand[] = new int [5];
		
		while(scan.hasNext()){
			String[] str = scan.next().split(",");
			for(int i=0; i<str.length; ++i){
				hand[i] = Integer.parseInt(str[i]);
			}
			
			int group[] = new int [14];	//添字がカードナンバと対応。０は欠番
			Arrays.fill(group, 0);
			for(int i=0; i<hand.length; ++i){
				++group[hand[i]];
			}
			
			if(checkFourCard(group)){
				System.out.println("four card");
			}else if(checkFullHouse(group)){
				System.out.println("full house");
			}else if(checkStraight(group)){
				System.out.println("straight");
			}else if(checkThreeCard(group)){
				System.out.println("three card");
			}else if(checkTwoPair(group)){
				System.out.println("two pair");
			}else if(checkOnePair(group)){
				System.out.println("one pair");
			}else{
				System.out.println("null");
			}
		}
	}
}