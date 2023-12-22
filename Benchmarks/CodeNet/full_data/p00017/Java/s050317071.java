import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan.useDelimiter("\\r\\n");
		while(scan.hasNext()){
        	String str = scan.nextLine();
        	int m = 0;
        	String string = null;
        	for(int i = 0; i < 26;i++){
        		char[] ch = str.toCharArray();
        		for(int j = 0;j < ch.length;j++){
        			if (ch[j] != '.' && ch[j] != ' '){
                        ch[j] = (char) ('a' + (ch[j] - 'a' + i) % 26);
        			}
        		}
        		string = String.valueOf(ch);
        		if(string.indexOf("the") != -1 || string.indexOf("this") != -1 ||string.indexOf("that") != -1){
        			m = 1;
        			break;
        		}
        	}
        	if(m == 1){
        		System.out.println(string);
        	}else{
        		System.out.println();
        	}
        }
		System.exit(0);
	}
}