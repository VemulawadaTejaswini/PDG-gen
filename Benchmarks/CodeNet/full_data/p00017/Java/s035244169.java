import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	private static final char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private static final int    ALP_NUM  = 26;
	private static final String REGEX    = "(the|this|that)";

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

        char[] in_ar;
        char[] tmp_ar;
    	Pattern p = Pattern.compile(REGEX);
        while(sc.hasNext()){
            in_ar = sc.next().toCharArray();
            tmp_ar = new char[in_ar.length];

            for(int i=0;i<ALP_NUM;i++){

            	//change character.
            	for(int j=0;j<in_ar.length;j++){
            		tmp_ar[j] = change_char(in_ar[j],i);
            	}

            	if (p.matcher(String.valueOf(tmp_ar)).find()){break;}
            }
            System.out.println(tmp_ar);
        }
    }

    private static char change_char(char c,int i){

    	if(c == '.' || c == ' '){return c;}

    	int index = 0;
    	for(int j=0;j<ALP_NUM;j++){
    		if(alphabet[j] == c){
    			index = j;
    			break;
    		}
    	}
    	return alphabet[(index + i) % ALP_NUM];
    }
}