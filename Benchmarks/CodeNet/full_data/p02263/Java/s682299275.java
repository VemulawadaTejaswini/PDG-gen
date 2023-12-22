import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
class Main {
    static StringBuilder builder = new StringBuilder();
 
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        final String[] str = reader.readLine().split(" ");
        
        System.out.println(String.valueOf(getReversePolishResult(str)));
    }
 
    private static int getReversePolishResult(final String str[]){
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 0;i < str.length;++i){
    		final int lastIndex = list.size();
    		switch(str[i].charAt(0)){
    		case '+':{
    			final int num = list.get(lastIndex - 2) + list.get(lastIndex - 1);
    			list.remove(lastIndex - 1);
    			list.remove(lastIndex - 2);
    			list.add(num);
    			break;
    		}
    		case '-':{
    			final int num = list.get(lastIndex - 2) - list.get(lastIndex - 1);
    			list.remove(lastIndex - 1);
    			list.remove(lastIndex - 2);
    			list.add(num);
    			break;
    		}
    		case '*':{
    			final int num = list.get(lastIndex - 2) * list.get(lastIndex - 1);
    			list.remove(lastIndex - 1);
    			list.remove(lastIndex - 2);
    			list.add(num);
    			break;
    		}
    		default:
    			list.add(Integer.parseInt(str[i]));
    			break;
    		}
    	}
    	
    	return list.get(0);
    }
}