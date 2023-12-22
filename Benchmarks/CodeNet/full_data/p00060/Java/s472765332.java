import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }

    static void solve(){
	int c1 = kbd.nextInt();
	int c2 = kbd.nextInt();
	int c3 = kbd.nextInt();
	boolean[] card = new boolean[11];
	Arrays.fill(card, true);
	card[0] = card[c1] = card[c2] = card[c3] = false;

	int i;
	int sum = 0;
	double p=0;
	for(i=1; i<card.length; i++){
	    if(card[i]){
		sum = c1+c2+i;
		if(sum <= 20) p++;
	    }
	}

	p = p/7*100;
	//System.out.println(p);
	if(p>=50)
	    System.out.println("YES");
	else
	    System.out.println("NO");
    }
}