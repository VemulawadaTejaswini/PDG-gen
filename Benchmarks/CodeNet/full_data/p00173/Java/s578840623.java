import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    class Clazz {
	String name;
	int am, pm, sum;
	long money;

	Clazz(String n, int a, int p){
	    name = n;
	    am = a;
	    pm = p;
	    sum = am+pm;
	    money = am*200 + pm*300;
	}

	String show(){
	    return 
		name+" "+sum+" "+money;
	}
    }

    void run(){
	Clazz[] cl = new Clazz[9];
	int i=0;
	for(i=0; i<9; i++){
	    String s = sc.next();
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    cl[i] = new Clazz(s, a, b);
	}
	for(i=0; i<9; i++)
	    System.out.println(cl[i].show());
    }
}
	    