import java.io.IOException;
import java.util.Scanner;

public class Main  {
    // static void swapidx(int[] arr, int lhs, int rhs){
    // 	int tmp = arr[lhs];
    // 	arr[lhs] = arr[rhs];
    // 	arr[rhs] = tmp;
    // 	return;
    // }
    
    // public static void main(String [] args){
    // 	Scanner sc = new Scanner(System.in);
    // 	int w = sc.nextInt();
    // 	int n = sc.nextInt();

    // 	int[] lines = new int[w];
    // 	for(int i=0; i<lines.length;++i){
    // 	    lines[i] = i;
    // 	}
	
    // 	for(int i=0; i<n;++i){
    // 	    System.out.println(sc.nextInt();
    // 	    int l = sc.nextInt();
    // 	    String comma = sc.next();
    // 	    int r = sc.nextInt();
    // 	    swapidx(lines, l, r);
    // 	}
    // 	System.out.println(lines);
    // }
    static int getOffset(char c){
	return (int)c - (int)'a';
    }
    
    static char getChar(int offset){
	return (char)((int)'a' + offset);
    }
    static void printabc(int[] abc){
	for(int i=0; i<26;++i){
	    System.out.println(getChar(i) + " : " + abc[i]);
	}
    }
    
    public static void main(String [] args){
	int[] abc = new int[26];
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextLine()){
	    String line = sc.nextLine();
	    System.out.println(line);
	    if(line.charAt(0) == (char)-1){
		printabc(abc);
		break;
	    }
	    for(int i=0; i<line.length();++i){
		char c = line.charAt(i);
		if(c<0 || c>25)continue;
		abc[getOffset(c)] += 1;
	    }
	}
	printabc(abc);

    }

}