import java.util.HashMap;
import java.util.Scanner;

class Main{

    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	HashMap<String,Integer> map = new HashMap<String,Integer>();
    	//String^ÌL[ÉÎ·éAIntegerÌl
    	int mc = 0;				//}bv³êÄ¢élÌÅål
    	String mcWord = "";
    	String max = "";
    	
    	while(scan.hasNext()){		//ÐÆÂ¸Â©Ä¢­
    		String str = scan.next();
    		if(max.length()<str.length()) max = str;
    		if(map.containsKey(str)){		//mapÉstr(æØçê½âÂ)ª êÎA
    			int count = map.get(str);		//strÉ}bv³êÄ¢élðæèo·(±Ìêñ)
    			map.put(str,++count);			//ñðXV·éBiúlÍ«Ìelse¶Éæè1)
    			if(mc < count){
    				mc = count;
    				mcWord = str;
      			}
      		} else {
      			if(mc < 1){		//v·éÉêÔÅÌPêðÅå(î)Æ·éÁÄ±ÆB
      				mc = 1;				//while[vàÅÏðè`·éÆA
      				mcWord = str;		//»ÌubNàÅÌ[JÏÉÈÁÄµÜ¤©çB
      			}
      			map.put(str, 1);
      		}
    	}
    	System.out.println(mcWord + " " + max);
    }
}