import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem1101_ASimpleOfflineTextEditor {
public class Main {
	
	private String text;
	private int cursor;
	
	public static void main(String[] args) {
		try {
		//	Problem1101_ASimpleOfflineTextEditor test = new Problem1101_ASimpleOfflineTextEditor();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int caseCount = Integer.parseInt(reader.readLine());
			int caseNumber = 0;
			for(int i = 0; i < caseCount; i++) {
				
				test.initialize(reader.readLine());
				int editCount = Integer.parseInt(reader.readLine());
				for(int j = 0; j < editCount; j++) {
					test.doCommand(reader.readLine());
				}
				test.showAnswer();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void initialize(String line) {
		setText(line);
		cursor = -1;
	//	System.out.println("ツ渉可甘コツ可サ:cursor:" + cursor + "\t" + text);
	}
	void doCommand(String command) {
		if(command.startsWith("forward c")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			forwardChar();
		} else if(command.startsWith("forward w")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			forwardWord();
		} else if(command.startsWith("backward c")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			backwardChar();
		} else if(command.startsWith("backward w")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			backwardWord();
		} else if(command.startsWith("insert")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			insert(command.substring(8, command.length()-1));
		} else if(command.startsWith("delete c")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			deleteChar();
		} else if(command.startsWith("delete w")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			deleteWord();
		} else {
	//		System.out.println("**ツコツマツδ督ドツエツδ可ー:" + command);
		}
	//	System.out.println("text:\t" + text + "\tcursor: " + cursor);
	}
	private void forwardChar() {
		if(cursor < text.length()) {
	//		System.out.println("ツ北ツ北");
			cursor++;
		}
	}
	private void forwardWord() {
		if(cursor == text.length()-1 || text.length() == 0) {
			return;
		}
		cursor++;
		while(text.charAt(cursor) == ' ') {
			cursor++;
		}
		for(int i = cursor; i < text.length(); i++) {
			char targetChar = text.charAt(i);
			if(targetChar == ' ') {
			/*	while(text.charAt(i+1) == ' ') {
					i++;
				}
			*/	
				cursor = i-1;
				return;
			} else {
				//do more
			}
		}
		cursor = text.length()-1;
	}
	private void backwardChar() {
		if(-1 < cursor) {
			cursor--;
		}
	}
	private void backwardWord() {
	/*	if(cursor == text.length()) {
			cursor--;
		}	*/
		if(cursor < 1) {
			cursor = -1;
			return;
		}
		cursor--;
		while(text.charAt(cursor) == ' ') {
			cursor--;
		}
		for(int i = cursor; i > -1; i--) {	//ツ催渉可づ個閉カツ篠堋つェツ凝ウツ板陳つセツづつスツ湘ェツ債づ可妥篠可楪つキツづゥツつスツづ淞０ツづ慊づ確ツ認ツつキツづゥ
			char targetChar = text.charAt(i);
			if(targetChar == ' ') {
				cursor = i+1;
				return;
			} else {
				//do more
			}
		}
		cursor = -1;
	}
	private void insert(String txt) {
		StringBuilder builder = new StringBuilder(text.substring(0, cursor+1));
		builder.append(txt);
		builder.append(text.substring(cursor+1));
		
		text = builder.toString();
		cursor += txt.length();
	}
	private void deleteChar() {
		if(cursor == text.length()-1) {
			return;
		}
		StringBuilder builder = new StringBuilder(text.substring(0, cursor+1));
		builder.append(text.substring(cursor+2));
		
		setText(builder.toString());
	}
	private void deleteWord() {
		if(cursor == text.length()-1) {
			return;
		}
		int start = cursor++;
		moveToEndOfWord();
		
		StringBuilder builder = new StringBuilder(text.substring(0, start+1));
		builder.append(text.substring(cursor+1));
		
		setText(builder.toString());
		cursor = start;
	}
	private void moveToEndOfWord() {
		if(cursor == text.length()-1) {
			return;
		}
		while(text.charAt(cursor) == ' ') {
			cursor++;
		}
		for(int i = cursor; i < text.length(); i++) {
			char targetChar = text.charAt(i);
			if(targetChar == ' ') {
				cursor = i-1;
				return;
			} else {
				//do more
			}
		}
		cursor = text.length()-1;
	}
	private void setText(String txt) {
		text = txt;
	}
	void showAnswer() {
	//	System.out.println("text:\t" + text + "\tcursor: " + cursor);
		
		StringBuilder resultBuilder = new StringBuilder(text.substring(0, cursor+1));
		resultBuilder.append("^");
		resultBuilder.append(text.substring(cursor+1));
		System.out.println(resultBuilder.toString());
	}
}