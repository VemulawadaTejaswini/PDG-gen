import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	
	public static Integer encryptStep = null;
	public static String encryptedMessage = "";
	public static String decryptedMessage = "";
	
	public static void main(String args[]) throws IOException{
		BufferedReader inMsg = new BufferedReader(new InputStreamReader(System.in));
		
		while ((encryptedMessage = inMsg.readLine()) != null) {
			decryptedMessage = "";
			encryptStep = null;
			
			findEncryptStep(encryptedMessage);
			
			if(encryptStep != null){
				convertMsg();
				System.out.println(decryptedMessage);
			} 
		}

		return;
	}
	
	/**
	 * ?????????????????¨??????????????????????????¢??????
	 * @param msg
	 */
	public static void findEncryptStep(String msg){
		String[] words;
		String newString = msg;
		
		if(newString.contains(".")){
			newString = msg.replace(".", "");
		}
		
		words = newString.split(" ");
		
        for (String word : words) {
        	checkWords(word);
        	if(encryptStep!=null){
	    		break;
	    	}
        }
		
	}
	
	/**
	 *  ???????????????????????????
	 */
	public static void convertMsg(){
		
		int len = encryptedMessage.length();
		
		for(int i = 0; i<len ; i++){
			decryptedMessage = decryptedMessage + shiftChars(encryptedMessage.charAt(i), encryptStep);
		}
	}
	
	/**
	 * ???????????????????????§??????????????????
	 * @param chr
	 * @return
	 */
	public static char shiftChars(char chr, int step){
		
		int shifted = 0;
		
		if(chr == ' ' || chr == '.'){
			return chr;
		}

		if(chr >= 'a' && chr <= 'z'){
			shifted = chr - step;
			
			if(shifted > 'z'){
				shifted = ('a' - 1)  + (shifted - 'z');
			} else if(shifted < 'a'){
				shifted  = ('z' + 1) - ('a' - shifted);
			}
		}
		
		return (char)shifted;
	}
	
	/**
	 * ?????????THE???THIS???THAT?????????????????§???????????¨????¢??????????
	 * ?????????????????¨???????????????????????????????????????
	 * @param words
	 */
	public static void checkWords(String words){
		
		int wordLen = words.length();
		String tempWord = "";
		
    	if(wordLen == 3 || wordLen == 4){
    		for(int matchShift = 0; matchShift < 27; matchShift ++ ){
    			tempWord = "";
    			
    			for(int j = 0; j < wordLen; j++){
    				tempWord = tempWord + shiftChars(words.charAt(j), matchShift);
    			}
    			
    			if(!tempWord.isEmpty()){
    				if("the".equals(tempWord) || "this".equals(tempWord) || "that".equals(tempWord)){
    					encryptStep = matchShift;
    					break;
    				}
    			}
    		}
    	}
    	
	}

}