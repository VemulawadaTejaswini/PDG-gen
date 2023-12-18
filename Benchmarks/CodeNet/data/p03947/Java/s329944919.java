import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String S=in.next();
		int condition =0;
		int count=0;
		for (int i = 1; i < S.length(); i++) {
			if(S.charAt(i-1)!=S.charAt(i)) {
				condition=0;
				break;
			}
			if(i==S.length()-1)
				condition++;
		}
                
				while(condition ==0){
                    if(S.charAt(0)=='W') {
                    	S='B'+S;
                    	String t="";
                    	for (int i = 1; i < S.length(); i++) {
							if(S.charAt(i)=='W' && i!=S.length()-1) {
								t=t+'B';
							}
							if(S.charAt(i)=='B') {
								t=t+S.substring(i+1,S.length());
								count++;
								break;
							}
							if(i==S.length()-1) {
								condition++;
							}
						}
                    	S=t;
                    	for (int i = 1; i < S.length(); i++) {
                			if(S.charAt(i-1)!=S.charAt(i)) {
                				condition=0;
                				break;
                			}
                			if(i==S.length()-1) {
                				condition++;
                			}
                		}
                    }
                    else if(S.charAt(0)=='B') {
                    	S='W'+S;
                    	
                    	String t="";
                    	for (int i = 1; i < S.length(); i++) {
							if(S.charAt(i)=='B' && i!=S.length()-1) {
								t=t+'W';
							}
							if(S.charAt(i)=='W') {
								t=t+S.substring(i+1,S.length());
								count++;
								break;
							}
							if(i==S.length()-1) {
								condition++;
							}
						}
                    	S=t;
                    	for (int i = 1; i < S.length(); i++) {
                			if(S.charAt(i-1)!=S.charAt(i)) {
                				condition=0;
                				break;
                			}
                			if(i==S.length()-1)
                				condition++;
                		}
                    }
                }
                System.out.println(count);
	}
}