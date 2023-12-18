import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);

	     int loopCount = sc.nextInt();
	     String checkWord1 = "";

	     List<String> wordList = new ArrayList<String>();


	     for (int i = 0; i < loopCount; i++) {
	    	 String word = sc.next();
	    	 String wordFirst = word.substring(0, 1);

	    	 //つながってる？
	    	 if (i >= 1) {
		    	 if (!checkWord1.equals(wordFirst)) {
		    		 System.out.println("No");
		    		 System.exit(-1);
				}
			}

	    	 wordList.add(word);
	    	 checkWord1 = word.substring(word.length() -1, word.length());
		}


	   //ワードList内に同じ言葉があるか
	     String checkWord2;
	     String checkWord3;
	     int trueCount = 0;


	     for (int i = 0; i < loopCount; i++) {
	    	 checkWord2 = wordList.get(i);

	    	 for (int j = 0; j < loopCount; j++) {
	    		 checkWord3 = wordList.get(j);
			     if (checkWord2.equals(checkWord3)) {
			    	 trueCount++;
					}
			}

		}

	     if(trueCount != loopCount) {
	    	 System.out.println("No");
	    	 System.exit(-1);
	     }

	    	 System.out.println("Yes");
	}
}
