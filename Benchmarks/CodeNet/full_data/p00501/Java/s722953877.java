import java.util.Scanner;
public class Main {
	private boolean stringMach(char[] base,String boardStr) {
		
		int boardStrlen = boardStr.length()-1; 
		int baseIndex = 0;
		for(int i=0;i<boardStrlen;i++){
			if(base[baseIndex]==boardStr.charAt(i)){
				baseIndex++;
				for(int j=i+1;j<boardStrlen;j++){
					if(base[baseIndex]==boardStr.charAt(j)){
						int margin = j-i;
						baseIndex++;
						for(int k=j+margin;k<=boardStrlen;k+=margin){
							if(base[baseIndex]==boardStr.charAt(k)){
								baseIndex++;
							}else k=boardStrlen;
								if(baseIndex==base.length){
									return true;
								}
							}
						}
					baseIndex = 1;
					}
				}
			baseIndex = 0;
			}
		return false;
	}
	
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int boardNam = sc.nextInt();
		String [] board  = new String[boardNam];
		char base[] = sc.next().toCharArray();
		int trueNum = 0;
		for(int i=0;i<boardNam;i++){
			board[i] = sc.next();
		}
		for(int i=0;i<boardNam;i++){
			if(stringMach(base, board[i])){
				trueNum++;
			}
		}
		System.out.println(trueNum);
	}
	
	public static void main(String[] args){
		new Main().doIt();
	}
}