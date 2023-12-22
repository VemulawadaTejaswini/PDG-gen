import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int h,w;
	static char[][] field = new char[1002][1002];
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	static boolean read(){
		/*
		 * Ü¸ÍÇÝæèðs¤B
		 * hªcÅAwª¡B
		 */
		h = sc.nextInt();
		w = sc.nextInt();
		//System.out.println(h + " "+ w);fobOp
		/*
		 * àµAhÆwªÆàÉOÈçÎAI¹B
		 */
		if(h == 0 && w == 0)
			return false;
		
		/*
		 * fieldÉ«ÞìÆB
		 * üÍð1sÆÁÄAlineÉÛB
		 * <|Cg(charAt)>
		 * charAt(n)ÍOðî_ÆµÄAnÔÚÌ¶ðÔ·B
		 * String string = "ABCDE";
		 * System.out.println(string.charAt(2));
		 * ÈçCª\¦³êéB
		 */
		for(int i = 1; i <= h ;i++){
			String line = sc.next();//±±ÅêsÇÝÞ
			for(int j = 1; j <= w; j++){
				field[i][j] = line.charAt(j - 1);//charAtÍOªî_
			}
		}
		return true;
	}
	
	/*
	 * @param ret ªzðó¯él
	 * 
	 * field[i][j]ªóÅÈ©Á½çAzªðó¯æélª
	 * K¸¢éÌÅAretðCNgµÄÇÝñ¾¶ð
	 * recÖÉn·B
	 */
	static int slove(){
		int ret = 0;
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w ;j++){
				if(field[i][j] != ' '){
					ret++;
					rec(j, i, field[i][j]);
				}
			}
		}
		return ret;
	}
	
	/*
	 * recÖÅ4ûüTõB
	 * zñdx,dyðñ·±ÆÉæÁÄTõðÀ»B
	 * 
	 */
	static void rec(int x, int y, char c){
		for(int k = 0; k < 4; k++){
			int nx = x + dx[k],//±±Å4ûüTõ
				ny = y + dy[k];
			/*
			 * àµATõÎÛªøÅó¯æÁ½cÆ
			 * êv·éÈçA' 'Åu«·¦Ä»Ì4ûüð
			 * ÄÑTõ·éB
			 */
			if(field[ny][nx] == c){
				field[ny][nx] = ' ';//±±ÅÀÛÉu«·¦ÄéB
				rec(nx, ny, c);//ÄAÄÑoµB
			}
		}
	}
	
	/*
	 * Ü¸ÍfieldðóÅú»·éB
	 * »Ì ÆÍ¢ÂàÆ¯¶B
	 * boolean^ÌreadÖÉÎµÄwhile[vB
	 * int^ÌsloveÖÉÎµÄprintlnÖÅ\¦·éB
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 1002; i++){
			for(int j = 0; j < 1002; j++){
				field[i][j] = ' ';
			}
		}
		while(read()){
			System.out.println(slove());
		}
	}
}