import java.io.*;
import java.util.*;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,ArrayList<Integer>> books = new HashMap();
		ArrayList<String> availableBooks = new ArrayList<String>();
		boolean cont = true;
		String[] str = null;
		
		while (cont) {
			try{
				str = bf.readLine().split(" ");//??¬?????????????????????????????§??????
				
				//??¢?????¬????????????????????????????????????????¢??????????
				if(!books.containsKey(str[0])){
					books.put(str[0], new ArrayList<Integer>());//????????´???????????¬???????????????????????????
					availableBooks.add(str[0]);
				}
				
				books.get(str[0]).add(Integer.parseInt(str[1]));//??¬???????????????????????????
				Collections.sort(books.get(str[0]));//?°????????????????????????????
				
			}catch(ArrayIndexOutOfBoundsException e){
				cont = false;//??????????????\??£?????¨???????????¨????????§???????????????
				Collections.sort(availableBooks);
			}
		}
			
		//????????????
		for(int i = 0 ; i < books.size() ; i++){
			ArrayList<Integer> showPages = books.get(availableBooks.get(i));
			System.out.println(availableBooks.get(i));
			for(Integer page : showPages){
				System.out.print(page + " ");
			}
			System.out.println();
		}	
	}
}