import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word + word;
        String key = br.readLine();
        boolean result = false;

        for(int i = 0; i< word.length();){
        	int index = word.indexOf(key.charAt(0), i);
        	if(index == -1 || result || index + key.length() >  word.length()) break;

        	for(int j = 0; j < key.length();j++){
        		if(word.charAt(j + index)!=key.charAt(j)){
        			i = index + 1;
        			break;
        		}
        		if(j == key.length() -1){
        			result = true;
        			break;
        		}
        	}
        }

        if(result){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}