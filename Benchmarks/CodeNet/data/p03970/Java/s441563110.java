import java.util.*;
public class Main {// Main
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	String S = in.nextLine();
    	char[] chs = {'C','O','D','E','F','E','S','T','I','V','A','L','2','0','1','6'};
    	char[] input = S.toCharArray();
    	int count = 0;
    	for(int i=0; i<16; i++){
    		if(chs[i]!=input[i])count++;
    	}
    	System.out.println(count);
    }
}