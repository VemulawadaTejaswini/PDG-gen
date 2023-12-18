import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String word = scan.next();
      	int subWordLength = 0;
      	int longestWordLength = 0;
      	for(int i=0; i < word.length(); i++){
        	String x = word.substring(i,i+1);
          	if(x.equals("A")||x.equals("C")||x.equals("G")||x.equals("T")){
            	subWordLength++;
            } else {
            	if(longestWordLength < subWordLength){
                	longestWordLength = subWordLength;
                }
              	subWordLength = 0;
            }
        }
        if(longestWordLength < subWordLength){
            longestWordLength = subWordLength;
        }      	
      	System.out.println(longestWordLength);
    }
}