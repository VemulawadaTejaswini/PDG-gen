
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(true){
			String str = cin.next();
			
			if(str.equals("#")){
				return;
			}
			boolean contain=false;	
			str = str.replace('|', '@');
			String[] kou = str.split("@");
			for(int i = 0; i < kou.length;i++){
				//System.out.println(kou[i]);
				char[] chars = new char[3];
				int cnt=0;
				for(int j = 0; j  <kou[i].length();j++){
					if(Character.isLetter(kou[i].charAt(j))){
						chars[cnt++]=kou[i].charAt(j);
					}
				}
				for(int j = 0; j < 3;j++){
					if((kou[i].contains(String.valueOf(chars[j]))
							&& kou[i].contains("~" + String.valueOf(chars[j])))){
						contain = true;
					}
					
				}
				if(!contain){
					System.out.println( "yes");
					continue label;
				}
			}
			if(contain){
				System.out.println("no");
			}
		}
	}

}