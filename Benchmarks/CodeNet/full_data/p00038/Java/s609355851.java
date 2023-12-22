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
	    String res;

	    if(straight(hand)) res = "straight";
	    else res = func(hand);

	    System.out.println(res);
	}
    }

    String func(int[] hand){
	int[] num = new int[14];
	for(int i = 0; i < 14; i++) num[i] = 0;
	for(int i = 0; i < 5; i++) num[hand[i]]++;
	
	for(int i = 0; i < 14; i++){
	    if(num[i] == 4) return "four card";
	    else if(num[i] == 3){
		for(int j = i+1; j < 14; j++)
		    if(num[j] == 2) return "full house";

		return "three card";
	    } else if(num[i] == 2){
		for(int j = i+1; j < 14; j++){
		    if(num[j] == 3) return "full house";
		    else if(num[j] == 2) return "two pair";
		}

		return "one pair";
	    }
	}

	return "null";
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

    public static void main(String[] args){
	new Main();
    }
}