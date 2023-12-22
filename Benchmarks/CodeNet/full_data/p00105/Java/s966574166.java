import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<wData> book = new ArrayList<wData>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			String word = dst[0];
			int page = Integer.parseInt(dst[1]);

			if(page == 0){
				break;
			}

			boolean isOverlap = false;
			for(int i=0; i<book.size(); i++){
				if(word.equals(book.get(i).word)){
					book.get(i).addPage(page);
					isOverlap = true;
					break;
				}
			}

			if(!isOverlap){
				wData data = new wData(word, page);
				book.add(data);
			}
		}

		book = BookSort(book);

		for(int i=0; i<book.size(); i++){
			String word = book.get(i).word;
			List<Integer> pages = book.get(i).pages;
			System.out.println(word);
			for(int j=0; j<pages.size(); j++){
				System.out.print(pages.get(j));

				if(j != pages.size()-1){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		}
	}

	public List<wData> BookSort(List<wData> book){
		String[] words = new String[book.size()];
		List<wData> ans = new ArrayList<wData>();

		for(int i=0; i<book.size(); i++){
			words[i] = book.get(i).word;
		}

		Arrays.sort(words);
		for(int i=0; i<words.length; i++){
			for(int j=0; j<book.size(); j++){
				if(words[i].equals(book.get(j).word)){
					ans.add(book.get(j));
				}
			}
		}

		return ans;
	}
}

class wData{
	String word;
	List<Integer> pages;

	public wData(String word, int page){
		this.word = word;
		this.pages = new ArrayList<Integer>();
		this.pages.add(page);
	}

	public void addPage(int page){
		for(int i=0; i<pages.size(); i++){
			if(page < pages.get(i)){
				pages.add(i, page);
				break;
			}
			else if(i == pages.size()-1){
				pages.add(page);
				break;
			}
		}
	}
}