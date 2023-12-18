import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String word = scan.next();
        int longestSubWord = 0;
      	int wordLength = 0;
      	for(int i = 0; i < word.length; i++){
          	String x = word.substring(i,i);
        	if(x = "A" || x = "T" || x = "C" || x = "G"){
            	worLength++;
            } else {
            	if(longestSubWord < wordLength){
                	longestSubWord = wordLength;
                }
            	wordLength = 0;
            }
        }
      	System.out.println(longestSubWord);
    }
}