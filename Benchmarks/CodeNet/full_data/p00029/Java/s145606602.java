import java.util.HashSet;
//import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String[] wordArray = stdIn.nextLine().split(" ");
		Set<String> wordSet = new HashSet<String>();
		for(String i:wordArray){
			wordSet.add(i);
		}
		String[] notOverlapWordArray = wordSet.toArray(new String[0]);
		int[] wordCount = new int[notOverlapWordArray.length];
		for(int i = 0;i < notOverlapWordArray.length;i++){
			for(int j = 0;j < wordArray.length; j++){
				if(notOverlapWordArray[i].equals(wordArray[j])){
					wordCount[i]++;
				}
			}
		}
		String mostFrequentWord = null;
		int mostFrequentCount = -1;
		for(int i = 0;i < wordCount.length ; i++){
			if(mostFrequentCount < wordCount[i]){
				mostFrequentCount = wordCount[i];
				mostFrequentWord = notOverlapWordArray[i];
			}
		}
		String mostLongWord = null;
		int mostLongWordLength = -1;
		for(String i:notOverlapWordArray){
			if(mostLongWordLength < i.length()){
				mostLongWordLength = i.length();
				mostLongWord = i;
			}
		}
		System.out.println(mostFrequentWord + " " + mostLongWord);
//		Iterator<String> it = wordSet.iterator();

//		int[] wordCount = new int[wordSet.size()];
//		int wordMaxLength = 0;
//		for(int i = 0;i < wordCount.length; i++){
//			String tempWord = (String)it.next();
//			for(int j = 0;j < wordArray.length; j++){
//				if(wordArray[j].equals(tempWord)){
//					wordCount[i]++;
//					wordMaxLength = Math.max(wordMaxLength, wordArray[j].length());
//				}
//			}
//		}
//		int wordMaxCount = 0;
//		int wordMaxCountIndex = 0;
//		for(int i = 0;i < wordCount.length ;i++){
//			if(wordCount[i] > wordMaxCount){
//				wordMaxCount = wordCount[i];
//				wordMaxCountIndex = i;
//			}
//		}
//		int wordMaxLengthIndex = 0;
//		for(int i = 0; i < wordArray.length; i++){
//			if(wordArray[i].length() == wordMaxLength){
//				wordMaxLengthIndex = i;
//				break;
//			}
//		}
//		System.out.println(wordArray[wordMaxCountIndex] + " " + wordArray[wordMaxLengthIndex]);
	}
}