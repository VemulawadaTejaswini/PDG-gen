   
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	final int ALPHA_NUM=26;
	Scanner in = new Scanner(System.in);
	int[] cnt = new int[ALPHA_NUM];
	
	for(int i=0;i<ALPHA_NUM;i++)cnt[i]=0;
	    
	while(in.hasNext()){
	    String str = in.next();
	    for(int i=0;i<str.length();i++){
		char ch= str.charAt(i);

		if(('a'<= ch && ch<='z')|| ('A'<= ch && ch<='Z')){
		    if(Character.isUpperCase(ch))cnt[ch-(int)'A']++;
		    else if(Character.isLowerCase(ch))cnt[ch-(int)'a']++;
		}
	    }
	}
	    for(int i=0;i<ALPHA_NUM;i++)System.out.println((char)((int)'a'+i)+" : "+cnt[i]);
	
    }
}

