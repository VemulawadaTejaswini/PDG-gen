import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] str = (sc.next()).split(",");
	    int[] hand = new int[5];
	    for(int i = 0; i < 5; i++)
		hand[i] = Integer.parseInt(str[i]);
	    Arrays.sort(hand);
	    String res = "null";

	    if(straight(hand)) res = "straight";
	    else if(fourcard(hand)) res = "four card";
	    else if(fullhouse(hand)) res = "full house";
	    else res = paircard(hand);

	    System.out.println(res);
	}
    }

    boolean straight(int[] hand){
	boolean f;
	if(hand[0] == 1){
	    f = true;
	    for(int i = 1; i < 5 && f; i++)
		f = (hand[i] == 9+i);

	    if(f) return f;
	}
	f = true;
	for(int i = 1; i < 5 && f; i++)
	    f = (hand[i] == (hand[0]+i));

	return f;
    }

    boolean fourcard(int[] hand){
	boolean f = true;

	for(int i = 1; i < 4 && f; i++)
	    f = (hand[0] == hand[i]);
	if(f) return f;

	f = true;
	for(int i = 2; i < 5 && f; i++)
	    f = (hand[1] == hand[i]);

	return f;
    }

    boolean fullhouse(int[] hand){
	if(hand[0] == hand[1] && hand[2] == hand[3] && hand[2] == hand[4]) return true;
	if(hand[0] == hand[1] && hand[0] == hand[2] && hand[3] == hand[4]) return true;

	return false;
    }

    String paircard(int[] hand){
	boolean f;
	for(int i = 0; i < 3; i++){
	    f = true;
	    for(int j = 1; j < 3 && f; j++)
		f = (hand[i] == hand[i+j]);
	    if(f) return "three card";
	}

	for(int i = 0; i < 1; i++)
	    if(hand[i] == hand[i+1])
		for(int j = i+2; j < 4; j++)
		    if(hand[j] == hand[j+1]) return "two pair";

	for(int i = 0; i < 4; i++)
	    if(hand[i] == hand[i+1]) return "one pair";

	return "null";
    }
    public static void main(String[] args){
	new Main();
    }
}