import java.io.*;
public class Main {
    public static void main(String[] args) {    
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        try{
            String text = reader.readLine();
            String word = reader.readLine();
            for(int i = 0; i < text.length() - word.length() + 1; i++){
            	boolean flag = true;
            	for (int j = 0; j < word.length(); j++) {
            		if (text.charAt(i + j) != word.charAt(j)) {
            			flag = false;
            			break;
            		}
            	}
            	if(flag){
            		System.out.println(i);
            	}
            }
            reader.close();
            in.close();
        }catch(IOException e){
            System.out.println(e);
        }  
    }
}