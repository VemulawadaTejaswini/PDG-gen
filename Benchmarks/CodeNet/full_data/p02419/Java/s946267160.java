import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine().toUpperCase();
		String t = sc.nextLine();
		int w_count = 0;

		while(!t.equals("END_OF_TEXT")){
		    String t_array[] = t.split(" ");
		    w_count += seek_word_in_w(w, t_array);
		    t = sc.nextLine();
		}
		
		System.out.println(w_count);
	}
	
	public static int seek_word_in_w(String w, String []t_array){
	    int w_count = 0;
	    
	    for (String t_word: t_array){
	        if (t_word.toUpperCase().equals(w)){
	            w_count++;
	        } 
	    }
	    
	    return w_count;
	}
}
