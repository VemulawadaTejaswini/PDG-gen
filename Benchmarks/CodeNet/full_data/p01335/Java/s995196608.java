import java.util.Scanner;

public class Main{
    public Main(){
	Scanner sc = new Scanner(System.in);
	int f = 0;

	while(sc.hasNext()){
	    if(f == 1){
		System.out.println();
	    }
	    f = 1;
	    int n = sc.nextInt();
	    int card[][] = new int[4][];
	    int hand[] = new int[10];
	    for(int i = 0; i < 4; i++){
		card[i] = new int[14];
		for(int j = 1; j < 14; j++){
		    card[i][j] = sc.nextInt();
		}
	    }
	    hand[0] = 0;
	    for(int i = 1; i <= 9; i++){
		hand[i] = sc.nextInt();
	    }
	    for(int k = 0, s = 0, t = 0; k < n; k++, s = 0, t = 0){
		Player pl[] = new Player[5];
		for(int i = 0; i < 5; i++){
		    String st = sc.next();
		    pl[i] = new Player(st.substring(0, 1), st.substring(1, 2));
		}
		sort(pl);
		int a = pl[0].n, b = pl[1].n, c = pl[2].n, d = pl[3].n, e = pl[4].n;
		if(pl[0].m == pl[1].m && pl[0].m == pl[2].m && pl[0].m == pl[3].m && pl[0].m == pl[4].m){
		    t = 5;
		}
		if(a == 1 && b == 10 && c == 11 && d == 12 && e == 13 && t == 5){
		    t = 9;
		}
		if(a+1 == b && a+2 == c && a+3 == d && a+4 == e){
		    if(t == 5){
			t = 8;
		    } else {
			t = 4;
		    }
		}
		if(a == b && b == c && c == d){
		    t = 7;
		} else if(b == c && c == d && d == e){
		    t = 7;
		}
		if(a == b && b == c){
		    if(e == d){
			t = 6;
		    } else if(t == 0){
			t = 3;
		    }
		} else if(c == d && d == e){
		    if(a == b){
			t = 6;
		    } else if(t == 0){
			t = 3;
		    }
		}

		if(t == 0){
		    if(c == d && b == c){
			t = 3;
		    } else if(a == b && (c == d) || (d == e)){
			t = 2;
		    } else if(b == c && d == e){
			t = 2;
		    } else if(a == b || b == c || c == d || d == e){
			t = 1;
		    }
		}
		for(int i = 0; i < 5; i++){
		    s += card[pl[i].m][pl[i].n];
		}
		s *= hand[t];
		System.out.println(s);
	    }
	}
    }

    public void sort(Player[] pl){
	Player p;
	for(int i = 4; i >= 0; i--){
	    for(int j = 1; j <= i; j++){
		if(pl[j].n < pl[j-1].n){
		    p = pl[j];
		    pl[j] = pl[j-1];
		    pl[j-1] = p;
		}
	    }
	}
	return ;
    }

    public static void main(String[] args){
	new Main();
    }
}

class Player{
    public int n;
    public int m;

    public Player(){
    }

    public Player(String st, String s){
	if(st.equals("A")){
	    n = 1;
	} else if(st.equals("T")){
	    n = 10;
	} else if(st.equals("J")){
	    n = 11;
	} else if(st.equals("Q")){
	    n = 12;
	} else if(st.equals("K")){
	    n = 13;
	} else {
	    n = Integer.parseInt(st);
	}
	if(s.equals("S")){
	    m = 0;
	} else if(s.equals("C")){
	    m = 1;
	} else if(s.equals("H")){
	    m = 2;
	} else {
	    m = 3;
	}
    }
}