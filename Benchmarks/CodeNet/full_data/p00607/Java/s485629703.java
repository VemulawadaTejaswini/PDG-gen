import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			ArrayList<String> text = new ArrayList<String>();
			ArrayList<Character> commands = new ArrayList<Character>();
			String buffer = null;
			int l=0, c=0;
			/* input */
			while(true){
				line = br.readLine();
				if(line.equals("END_OF_TEXT")) break;
				text.add(line);
			}
			while(true){
				line = br.readLine();
				if(line.equals("-")) break;
				commands.add(line.charAt(0));
			}
			/* processing */
			for(char cm : commands){
				switch(cm){
				case 'a':
					c = 0;
					break;
				case 'e':
					c = text.get(l).length();
					break;
				case 'p':
					if(l>0){
						l--;
					}
					c = 0;
					break;
				case 'n':
					if(l<text.size()-1){
						l++;
					}
					c = 0;
					break;
				case 'f':
					if(c==text.get(l).length()){
						if(l<text.size()-1){
							l++;
							c = 0;
						}
					} else {
						c++;
					}
					break;
				case 'b':
					if(c==0){
						if(l>0){
							l--;
							c = text.get(l).length();
						}
					} else {
						c--;
					}
					break;
				case 'd':
					if(c<text.get(l).length()){
						text.set(l, text.get(l).substring(0,c) + text.get(l).substring(c+1,text.get(l).length()));
					} else if(l<text.size()-1){
						text.set(l, text.get(l).substring(0,c) + text.get(l+1));
						text.remove(l+1);
					}
					break;
				case 'k':
					if(c==text.get(l).length()){
						if(l<text.size()-1){
							text.set(l, text.get(l).substring(0,c) + text.get(l+1));
							text.remove(l+1);
							buffer = "\n";
						}
					} else {
						buffer = text.get(l).substring(c);
						text.set(l, text.get(l).substring(0,c));
					}
					break;
				case 'y':
					if(buffer==null){
						break;
					} else if(buffer.equals("\n")){
						text.add(l+1,text.get(l).substring(c));
						text.set(l, text.get(l).substring(0,c));
						l++;
						c = 0;
					} else {
						text.set(l, text.get(l).substring(0,c) + buffer + text.get(l).substring(c));
						c += buffer.length();
					}
					break;
				}
			}
			/* output */
			for(String s : text){
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}