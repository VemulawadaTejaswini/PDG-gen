import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
     	Map<String, Word> words = new HashMap<>();
      	for(int i = 0 ; i < n ; i++){
      		String str = sc.next();
      		if(words.containsKey(str)){
      			words.get(str).num++;
      		}else{
      			words.put(str, new Word(str, 1));
      		}
        }
        ArrayList<Word> sortedWords = new ArrayList<>(words.values());
        Collections.sort(sortedWords);
        int maxTimes = sortedWords.get(0).num;

        sortedWords.stream().filter(w -> w.num == maxTimes).forEach(w -> System.out.println(w.str));
    }
}

class Word implements Comparable<Word>{
	String str;
	int num;
	Word(String str, int num){
		this.str = str;
		this.num = num;
	}

	public int compareTo(Word tar){
		int result = tar.num - num;
		if(result == 0){
			result = str.compareTo(tar.str);
		}
		return result;
	}
}