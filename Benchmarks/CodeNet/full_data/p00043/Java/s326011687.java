import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			char[] d = sc.nextLine().toCharArray();
			
			//配列のindexとカードの番号を一致させた．datacount[0]は空けておく．
			int[] datacount = new int[9 + 1];
			datacount[0] = 0;
			
			//カードの枚数を調べる
			for(int i = 0; i < d.length; i++){
				datacount[new Integer(d[i] - '0')] ++;
			}
			
			StringBuffer output = new StringBuffer();
			for(int i = 1; i <= 9; i++){
				//カードiをつけ加えて，整うかどうか調べる．
				
				//カードiが既に4枚以上あるなら飛ばす
				if(datacount[i] == 4){continue;}
				
				//データを複製し，カードiを1枚つけ加える．
				int[] s = datacount.clone();
				s[i] ++;
				
				boolean res = search(s, false, 4);
				if(res){
					output.append(" ");
					output.append(i);
				}
			}
			
			if(output.length() == 0){output.append(" 0");}
			output.delete(0, 1);
			System.out.println(output);
		}
	}
	
	static boolean search(int[] data, boolean is2searched, int paircount){
		boolean res = false;
		if(!is2searched){
			//はじめは2枚ペアを探す
			
			for(int i = 1; i <= 9; i++){
				if(data[i] >= 2){
					int[] d = data.clone();
					d[i] = d[i] - 2;
					
					//残りのグループを探す
					boolean r = search(d, true, paircount);
					if(r){
						//成功例が1つでも存在すればOK．それ以上は調べない．
						res = true;
						break;
					}
				}
			}
		}else{
			//2枚ペアを探したあと，グループを探す
			
			if(paircount == 0){
				//グループを探し尽くしたあと
				
				//カードが1枚も残っていないか確認する
				for(int i : data){
					boolean flag = true;
					if (i != 0){
						flag = false;
						break;
					}
					
					//1枚も残ってないなら，flagはtrueなのでOK．
					//1枚でも残っていると，flagはfalseにされる．
					res = flag;
				}
			}else{
				//グループ探し中
				
				for(int i = 1; i <= 9; i++){
					boolean res1 = false;
					boolean res2 = false;
					
					//いま対象にしているカードiについて，3枚同一グループがあるか
					if(data[i] >= 3){
						int[] d = data.clone();
						
						d[i] = d[i] - 3;
						res1 = search(d, true, paircount - 1);
					}
					
					//カードiについて，そこから起点とする連続グループがあるか
					//i = 8, 9 はしらべなくてもいい
					if(i < 8 && data[i] >= 1 && data[i + 1] >= 1 && data[i + 2] >= 1){
						int[] d = data.clone();
						
						d[i] --;
						d[i + 1] --;
						d[i + 2] --;
						
						res2 = search(d, true, paircount -1);
					}
					
					//成功例が1つでもあればOK．それ以上は調べない．
					if(res1 || res2){
						res = true;
						break;
					}
				}
			}
		}
		
		return res;
	}
}