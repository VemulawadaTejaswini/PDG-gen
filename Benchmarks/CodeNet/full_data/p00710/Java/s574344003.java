import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
	
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int r = kbd.nextInt();
	    if(n!=0 && r!=0){
		int[] card = new int[n];
		int m = card.length;
		for(int i=0; i<card.length; i++){
		    card[i] = m;
		    m--;
		}

		while(r>0){
		    cut(card);
		    r--;
		    /*
		    for(int i=0; i<card.length; i++)
			System.out.print(card[i]+" ");
		    System.out.println();
		    */
		}
		
		System.out.println(card[0]);
	    }
	}
    }

    static void cut(int[] card) {
	int p = kbd.nextInt();
	int c = kbd.nextInt();

	int w = p-1;

	int[] move = new int[c];
	for(int a=0; a<move.length; a++){
	    move[a] = card[w];
	    w++;
	    /*
	      for(int i=0; i<card.length; i++)
	      System.out.print(card[i]+" ");
	      System.out.println();
	    */
	}
	
	w = p+c-2;
	for(int j=p-2; j>=0; j--){
	    card[w] = card[j];
	    w--;
	    /*
	    for(int i=0; i<card.length; i++)
		System.out.print(card[i]+" ");
	    System.out.println();
	    */
	}
	
	for(int k=0; k<c; k++){
	    card[k] = move[k];
	    /*
	      for(int i=0; i<card.length; i++)
		System.out.print(card[i]+" ");
	    System.out.println();
	    */
	}
    }
}
	