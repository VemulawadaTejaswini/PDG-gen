import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String[] str = scan.nextLine().split(" ");
            boolean sw = false;
            for(int i = 1;i < 26;i++){
            	String[] nstr = new String[str.length];
            	for(int j = 0;j < str.length;j++){
            		nstr[j] = "";
            		for(int k = 0;k < str[j].length();k++){
            			char tc = str[j].charAt(k);
            			if(tc == ' ' || tc == '.' || tc == '\n'){
            				nstr[j] += tc;
            			}else{
            				int t = (int)tc - i;
            				nstr[j] += (char)((t < 96)?t+26:t);
            			}
            		}
            	}
            	for(int j = 0;j < nstr.length;j++){
            		if(nstr[j].length() < 2 || nstr[j].length() > 4 ){
            			continue;
            		}
            		String tstr = nstr[j].replace(".","");
            		if(tstr.equals("this") || tstr.equals("the") || tstr.equals("that")){
            			sw = true;
            			break;
            		}
            	}
            	if(sw){
            		for(int j = 0;j < nstr.length;j++){
            			System.out.print(nstr[j] + ((j == nstr.length-1)?"\n":" "));
            		}
            		break;
            	}
            }
        }
    }
}