import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    String s;
    String[] w;

    void run(){
	s = sc.nextLine();
	w = s.split("[ ,.]");
	show();
    }

    void show(){
	for(int i=0; i<w.length-1; i++)
	    System.out.print
		(w[i].length()>2 && w[i].length()<7 ? w[i]+" " : "");
	System.out.println(w[w.length-1]);
    }
}