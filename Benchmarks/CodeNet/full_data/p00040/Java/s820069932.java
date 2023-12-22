import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	input.nextLine();
    	for(int i = 0 ; i < n ; i++){
    		System.out.println(afin(input.nextLine()));
    	}
    }
    
    public static String afin(String st){
    	for(int i = 1 ; i <= 25 ; i+=2){
    		if(i % 13 == 0)continue;
    		for(int j = 0 ; j <= 25 ;j++){
        		StringBuilder sb = new StringBuilder();
    			for(int k = 0 ; k < st.length() ; k++){
    				char c = st.charAt(k);
    				if(c == ' '){
    					sb.append(" ");
    				}else{
    					char nc = (char)(((c-97)*i+j) % 26 + 97);
    					sb.append(nc);
    				}
    			}
    			//System.out.println(sb);
    			if(sb.indexOf("that") != -1 || sb.indexOf("this") != -1)return sb.toString();
    		}
    	}
    	return null;
    }
}