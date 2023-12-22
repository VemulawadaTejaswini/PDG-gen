import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
	char[] right = {'y', 'u', 'i','o', 'p', 'h', 'j', 'k', 'l', 'n', 'm'};

	while(kbd.hasNext()){
	    String word = kbd.next();
	    if(!word.equals("#")){
		String hand = "";
		int p = 0;
		int count = 0;
		char c = word.charAt(p);

		for(p=0; p<word.length(); p++){
		    int a=0;
		    c = word.charAt(p);
		    while(a<right.length && c!=right[a]) a++;
		    if(a<right.length && c == right[a]){
			if(hand.equals("l")) { hand="r"; count++; }
			else hand = "r";
		    }
		    else {
			if(hand.equals("r")) { hand="l"; count++; }
			else hand = "l";
		    }

		}

		System.out.println(count);
	    }
	}
    }
}