import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String dic = "yuiophjklnm";
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.equals("#")){
				break;
			}
			int count = 0;
			boolean hand = (dic.indexOf(str.charAt(0)) >= 0)?true:false;
			for(int i = 1;i < str.length();i++){
				if(dic.indexOf(str.charAt(i)) >= 0){
					if(!hand){
						count++;
						hand = true;
					}
				}else{
					if(hand){
						count++;
						hand = false;
					}
				}
			}
			System.out.println(count);
		}
	}
}