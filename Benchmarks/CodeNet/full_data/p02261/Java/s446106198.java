import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	final static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	final static StringBuilder sortedBubble = new StringBuilder();
	final static StringBuilder sortedSelect = new StringBuilder();
	final static String lb = System.getProperty("line.separator");
	
	final static Pattern patternSuit = Pattern.compile("[CDHS]");
	final static Pattern patternNum = Pattern.compile("[1-9]");
	
	static char[] suitsBubble = null;
	static char[] suitsSelect = null;
	static int[] seqBubble = null;
	static int[] seqSelect = null;
	
	public static void main(String[] args) {
		try {
			getSequence();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		bubbleSort();
		selectionSort();
		
		pritnSeqence();
	}
	
	public static void pritnSeqence() {
		boolean stable = true;
		for (int i = 0; i < suitsBubble.length; i++) {
			if (suitsBubble[i] != suitsSelect[i]) stable = false;
			
			final String end = i < seqBubble.length-1 ? " " : lb;
			sortedBubble.append(suitsBubble[i]).append(seqBubble[i]).append(end);
			sortedSelect.append(suitsSelect[i]).append(seqBubble[i]).append(end);
		}
		
		sortedBubble.append("Stable").append(lb);
		if (stable) {
			sortedSelect.append("Stable").append(lb);
		} else {
			sortedSelect.append("Not stable").append(lb);
		}
		sortedBubble.append(sortedSelect.toString());
		
		System.out.print(sortedBubble.toString());
	}
	
	public static void bubbleSort() {
		for (int i = 0; i < seqBubble.length; i++) {
			boolean hasSwaped = false;
			int key = seqBubble[0];
			char keySuit = suitsBubble[0];
			for (int j = 1; j < seqBubble.length-i; j++) {
				if (key <= seqBubble[j]) {
					key = seqBubble[j];
					keySuit = suitsBubble[j];
					
				} else {
					hasSwaped = true;
					
					seqBubble[j-1] = seqBubble[j];
					seqBubble[j] = key;
					suitsBubble[j-1] = suitsBubble[j];
					suitsBubble[j] = keySuit;
				}
			}
			if (!hasSwaped) break;
		}
	}
	
	public static int[] selectionSort() {
		for (int i = 0; i < seqSelect.length-1; i++) {
			int min = i;
			for (int j = i+1; j < seqSelect.length; j++) {
				if (seqSelect[j] < seqSelect[min]) min = j;
			}
			if (min != i) {
				final int tmpInt = seqSelect[i];
				seqSelect[i] = seqSelect[min];
				seqSelect[min] = tmpInt;
				
				final char tmpChar = suitsSelect[i];
				suitsSelect[i] = suitsSelect[min];
				suitsSelect[min] = tmpChar;
			}
		}

		return seqSelect;
	}
	
	public static void getSequence() throws IOException {
		final int n = Integer.parseInt(reader.readLine());
		final String line = reader.readLine();
		
		final Matcher matchSuit = patternSuit.matcher(line);
		final Matcher matchNum = patternNum.matcher(line);
		
		suitsBubble = new char[n];
		suitsSelect = new char[n];
		seqBubble = new int[n];
		seqSelect = new int[n];
		for (int i = 0; i < n; i++) {
			matchNum.find();
			matchSuit.find();
			
			final char c = matchSuit.group().charAt(0);
			suitsBubble[i] = c;
			suitsSelect[i] = c;
			
			final int num = Integer.parseInt(matchNum.group());
			seqBubble[i] = num;
			seqSelect[i] = num;
		}
	}
}