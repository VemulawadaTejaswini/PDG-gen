import java.util.Scanner;

public class Main{
    class Evt{
	int e;
	int a;

	Evt(){
	    e = a = 0;
	}
	Evt(int e, int a){
	    this.e = e;
	    this.a = a;
	}
    }

    Main(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    String[] str = (sc.nextLine()).split(" ");
	    int x = Integer.parseInt(str[0]);
	    int y = Integer.parseInt(str[1]);
	    int z = Integer.parseInt(str[2]);
	    if(x == 0 && y == 0 && z == 0){
		break;
	    }

	    int[] v = new int[4];
	    String[] st = (sc.nextLine()).split(" ");

	    for(int i = 0; i < x; i++){
		v[i] = Integer.parseInt(st[i]);
	    }

	    Evt[] evt = new Evt[y+1];
	    for(int i = 0; i <= y; i++){
		evt[i] = new Evt();
	    }

	    for(int i = 0; i < z; i++){
		String[] s = (sc.nextLine()).split(" ");
		int t = Integer.parseInt(s[0]);
		evt[t] = new Evt(Integer.parseInt(s[1]), Integer.parseInt(s[2]));
	    }

	    System.out.println(Integer.toString((int)func(evt, y, x, v, 1.0, 0, 0.0)));
	}
    }

    double func(Evt[] evt, int y, int x, int[] v, double d, int t, double c){
	if(t >= y){
	    return c*d;
	}
	double u = 0.0;
	if(evt[t].e == 1){
	    return func(evt, y, x, v, d, t+evt[t].a, c);
	} else {
	    double s;
	    if(evt[t].e == 2){
		s = c + evt[t].a;
	    } else {
		s = c - evt[t].a;
		if(s < 0){
		    s = 0;
		}
	    }
	    for(int i = 0; i < x; i++){
		u += func(evt, y, x, v, d/(double)x, t+v[i], s);
	    }
	}

	return u;
    }

    public static void main(String[] args){
	new Main();
    }
}