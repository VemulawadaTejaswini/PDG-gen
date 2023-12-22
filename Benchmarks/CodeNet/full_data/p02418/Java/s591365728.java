import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String key = br.readLine();
        word = word + word.substring(0, key.length() - 1);

        if(bmStringSearch(word,key)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }

    }

    private static boolean bmStringSearch(String word, String key){
    	 int[] table = new int[256];

         for(int i=0;i<table.length;i++){
         	table[i] = key.length();
         }
         for(int i=0;i<key.length();i++){
         	table[key.charAt(i)] = key.length() - i - 1;
         }

         int wordIndex = key.length() - 1;
         while(wordIndex < word.length()){
         	int keyIndex = key.length() -1;

         	while(word.charAt(wordIndex) == key.charAt(keyIndex)){
         		if(keyIndex == 0){
         			return true;
         		}
         		wordIndex--;
         		keyIndex--;
         	}

         	if(table[word.charAt(wordIndex)] > key.length()-keyIndex){
         		wordIndex += table[word.charAt(wordIndex)];
         	}else{
         		wordIndex += key.length() - keyIndex;
         	}
         }

         return false;
    }


}