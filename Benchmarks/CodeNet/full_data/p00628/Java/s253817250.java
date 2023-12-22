import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    String s;
    String[] w;
    int[] n;

    void run(){
	while(sc.hasNext()){
	    s = sc.nextLine();
	    if(s.equals("END OF INPUT")) break;

	    w = s.split(" ");
	    n = new int[w.length];
	    for(int i=0; i<w.length; i++)
		n[i] = w[i].length();

	    for(int i=0; i<n.length; i++)
		System.out.print(n[i]);
	    System.out.println();
	}
    }
}