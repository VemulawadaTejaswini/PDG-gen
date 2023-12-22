import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		ArrayList<Word> list = new ArrayList<Word>();

		while(!(str=br.readLine()).equals("")){
			String voc = str.substring(0, str.indexOf(" "));
			int n = Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()));

			if(list.isEmpty()){
				list.add(new Word(voc, n));
			}else{
				boolean judge=false;
				for(int i=0; i<list.size(); i++){
					if(list.get(i).getString().equals(voc)){
						list.get(i).ListIn(n);
						judge=true;
						break;
					}
				}
				if(!judge){
					list.add(new Word(voc, n));
				}
			}
		}
		Collections.sort(list, new Comparator<Word>() {
			public int compare(Word o1, Word o2) {
				return o1.getString().compareTo(o2.getString());
			}
		});

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getString());
			System.out.println(list.get(i).getNumbers());
		}

	}
}

class Word{
	String str;
	ArrayList<Integer> Index = new ArrayList<Integer>();

	Word(String str, int n){
		this.str = str;
		this.Index.add(n);
	}

	void ListIn(int n){
		Index.add(n);
		Collections.sort(Index);
	}

	String getString(){
		return this.str;
	}

	String getNumbers(){
		String str="";
		for(int i=0; i<Index.size(); i++){
			if(i == Index.size()-1){
				str += Index.get(i);
			}else{
				str += Index.get(i) + " ";
			}
		}
		return str;
	}

}