import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static int LIMIT = 200001;
    public static int[] sectionDiagrams = new int[LIMIT];
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String section = scan.nextLine();
	calculateDiagrams(section, 1);
	String reversedSection = "";
	String tmp = "";
	for (int i = 0; i < section.length(); i++) {
	    tmp = section.substring(i, i + 1);
	    if (tmp.equals("\\")) {
		tmp = "/";
	    } else if (tmp.equals("/")) {
		tmp = "\\";
	    }
	    reversedSection += tmp;
	}
	calculateDiagrams(reversedSection, -1);
	ArrayList<Integer> diagrams = new ArrayList<Integer>();
	int sum = 0;
	for (int i = 0; i < LIMIT; i++) {
	    if (sectionDiagrams[i] != 0) {
		diagrams.add(sectionDiagrams[i]);
		sum += sectionDiagrams[i];
	    }
	}
	System.out.println(sum);
	System.out.print(diagrams.size());
	for (int i = 0; i < diagrams.size(); i++) {
	    System.out.print(" " + diagrams.get(i));
	}
	System.out.println();
    }
    static void calculateDiagrams (String section, int direction) {
	String shape = "";
	boolean isIn = false;
	int outH = 0, nowH = 0;
	int sum = 0, inP = 0;
	int sp = 0;
	if (direction == -1) {
	    sp = section.length() - 1;
	}
	for (int i = sp; i >=0 && i < section.length(); i += direction) {
	    shape = section.substring(i, i+1);
	    if (isIn == false) {
		if (shape.equals("\\")) {
		    isIn = true;
		    outH = nowH;
		    nowH--;
		    inP = i;
		    sum = 1;
		} else if (shape.equals("/")) {
		    nowH++;
		}
	    } else {
		if (shape.equals("\\")) {
		    sum += outH - nowH + 1;
		    nowH--;
		} else if (shape.equals("/")) {
		    nowH++;
		    sum += outH - nowH;
		} else if (shape.equals("_")) {
		    sum += outH - nowH;
		}
		if (nowH == outH) {
		    if (direction == 1 && sectionDiagrams[inP] < sum) {
			sectionDiagrams[inP] = sum;
		    } else if (direction == -1 && sectionDiagrams[i] < sum){
			sectionDiagrams[i] = sum;
		    }
		    isIn = false;
		}
	    }
	}
    }
}