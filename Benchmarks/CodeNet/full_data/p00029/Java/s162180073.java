import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Map<String, Integer> sen = new HashMap<>();
		int max = 0;
        int count = 0;
		String aaa = null;
		int mwidth = 0;
		String mword = null;

		while(stdIn.hasNext()){
			String word = stdIn.next();
            
            if(count == 0){
            	aaa = word;   
            }

			if(mwidth < word.length() ){
				mwidth = word.length();
				mword = word;
			}

			if(sen.get(word) == null){
                
                sen.put(word, 0);
                
            }else{
            	int v = sen.get(word) + 1;
                sen.put(word, v);

                if(max <= v){
                	aaa = word;
                }

            }
            
            count++;
			 
		}
        System.out.println(aaa + " " + mword);
       
		stdIn.close();
	}

}
