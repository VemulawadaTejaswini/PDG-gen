import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] cards;
    int n, m;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    cards = new int[2*n];
	    for(int i=0; i<cards.length; i++)
		cards[i] = i+1;
	    m = sc.nextInt();

	    while(m-- > 0){
		//show();
		int k = sc.nextInt();
		if(k==0) rif();
		else cut(k);
	    }

	    for(int i=0; i<cards.length; i++)
		System.out.println(cards[i]);
	}
    }

    void rif(){
	int[] s = new int[cards.length];
	for(int i=0; i<s.length; i++)
	    s[i] = cards[i];

	int a = 0;
	for(int i=0; a<n; i++){
	    cards[i] = s[a];
	    i++;
	    cards[i] = s[a+n];
	    a++;
	}
    }

    void cut(int k){
	int[] s = new int[cards.length];
	for(int i=0; i<s.length; i++)
	    s[i] = cards[i];

	int a = k;
	for(int i=0; i<s.length; i++){
	    cards[i] = s[a];
	    a++;
	    if(a==s.length) a = 0;
	}
    }

    void show(){
	for(int i=0; i<cards.length; i++)
	    System.out.println(cards[i]);
	System.out.println("------------");
    }
}