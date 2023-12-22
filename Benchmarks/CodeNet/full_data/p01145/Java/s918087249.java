import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			String input = in.next();
			if(input.equals("#"))break;
			new AOJ2020().doIt(input);
		}
	}
	class AOJ2020{
		boolean is_boin(char t){
			if(t=='a'||t=='i'||t=='u'||t=='e'||t=='o')return true;
			return false;
		}

		boolean is_long(char one,char two){
			if((one=='a'&&two=='a')||(one=='i'&&two=='i')||(one=='u'&&two=='u')||(one=='e'&&two=='i')||(one=='o'&&two=='u'))return true;
			return false;
		}

		boolean is_hatsu(String a){ //'っ'  [kit][te]とか
			char[] text = a.toCharArray();
			if(text.length<=2)return false;
			//kyuとかsyuとかはだめ。子母子になるはず。
			if(!is_boin(text[0])&&is_boin(text[1])&&!is_boin(text[2]))return true; 
			return false;
		}

		boolean is_Long_Pack(String a){ // 'ー'のこと  [raa][men]とか
			char[] text = a.toCharArray();
			if(text.length<=2)return false;
			//kyuとかsyuとかはだめ。子母母になるはず。
			if(!is_boin(text[0])&&is_boin(text[1])&&is_boin(text[2]))return true; 
			return false;
		}

		char get_boin(String text){
			for(int i=text.length()-1;i>=0;i--)if(is_boin(text.charAt(i)))return text.charAt(i);
			return ' ';
		}

		boolean is_musei(String text){
			String a = text.charAt(0)+"";
			if(a.equals("k")||a.equals("s")||a.equals("t")||a.equals("h")||a.equals("p")||
					a.equals("ky")||a.equals("sy")||a.equals("ty")||a.equals("hy")||a.equals("py"))return true;
			return false;
		}
		
		String toResult(String text,boolean ismuon){
			if(!ismuon)return text;
			StringBuilder result = new StringBuilder(text);
			for(int i=text.length()-1;i>=0;i--)if(is_boin(text.charAt(i))){
				result.insert(i, '(');
				result.insert(i+2,')');
				break;
			}
			return result.toString();
		}

		void doIt(String input){
			int n=input.length();
			//			System.out.println(input); 
			ArrayList<String> list = new ArrayList<String>();
			String a = "";
			for(int i=0;i<n;i++){
				char s = input.charAt(i);
				a+=s;
				if(is_boin(s)){//母音の場合
					//次を見る.
					if(i+1<n&&is_boin(input.charAt(i+1))){//次が母音のとき
						//長音かどうか判別
						if(is_long(s, input.charAt(i+1))){
							list.add(a);
							list.add(""+input.charAt(i+1));
							a="";i++;
						}else{
							list.add(a);a="";
						}
					}else if(i+1<n&&!is_boin(input.charAt(i+1))){//次が子音のとき
						if(i+2<n&&input.charAt(i+2)==input.charAt(i+1)){
							a+=input.charAt(i+1);
							list.add(a);a="";i++;
						}else{
							list.add(a);a="";
						}
					}else{
						list.add(a);a="";
					}
				}else if(s=='n'){
					if(i+1<n&&input.charAt(i+1)=='\''){
						list.add(a+"\'");a="";i++;
					}else if(i+1<n&&!is_boin(input.charAt(i+1))&&input.charAt(i+1)!='y'){
						list.add(a);a="";
					}else if(i+1<n&&is_boin(input.charAt(i+1))){
						list.add(a+input.charAt(i+1));a="";i++;
					}else{
						list.add(a);a="";
					}
				}else if(!is_boin(s)){//母音の場合。
					continue;
				}
			}
//			System.out.println(list);
			//判定
			boolean sw[] = new boolean[list.size()];Arrays.fill(sw, true);
			boolean used[] = new boolean[list.size()];
			int m = list.size();
			for(int i=0;i<m;i++){
//				System.out.println(list.get(i));
				if(get_boin(list.get(i))=='i'||get_boin(list.get(i))=='u'){
					if(i==m-1&&is_musei(list.get(i))&&sw[i]){
						sw[i]=false;
						used[i]=true;
					}
					else if(is_musei(list.get(i))&&sw[i]&&is_musei(list.get(i+1))&&sw[i+1]){
						sw[i] = false;sw[i+1]=false;
						used[i]=true;
					}
				}

				if((i+1<m)&&((get_boin(list.get(i))=='o'&&get_boin(list.get(i+1))=='o')
						||(get_boin(list.get(i))=='a'&&get_boin(list.get(i+1))=='a'))){
					if(is_musei(list.get(i))&&sw[i]&&is_musei(list.get(i+1))&&sw[i+1]&&
							!is_Long_Pack(list.get(i))&&!is_Long_Pack(list.get(i+1))&&
							!is_hatsu(list.get(i))){
						sw[i] = false;sw[i+1]=false;
						used[i]=true;
					}
				}
			}
			
			String result = "";
			for(int i=0;i<m;i++)result += toResult(list.get(i), used[i]);
			System.out.println(result);
		}
	}
}