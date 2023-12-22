import java.io.*;
import java.lang.Integer;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {    
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        LinkedList<Integer> result = new LinkedList<Integer>();
        try{
            String text = reader.readLine();
            String word = reader.readLine();
            for(int i = 0; i < text.length() - word.length() + 1; i++){
            	String str = text.substring(i,i + word.length());
            	if(str.equals(word)){
            		result.add(new Integer(i));
            	}
            }
            Iterator<int> it = result.iterator();
            while (it.hasNext()) {
            	System.out.println(it.next());
            }
        }catch(IOException e){
            System.out.println(e);
        }  
    }
}