import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    String s = kbd.nextLine();
	    if(!s.equals("0")) solve(s);
	}
    }

    static void solve(String s){
	//String[] pattern = new String[60000];
	HashSet<String> set = new HashSet<String>();
	int pcnt = 0;
	Stack stack = new Stack(s);
	String a = s;
	set.add(s);
	//pattern[pcnt++] = a;
	int t = 0;
	while(!stack.isEmpty() && !color(a)){
	    //System.out.println(a+" "+color(a));
	    Worm w = stack.pop();
	    a = w.getbody();
	    t = w.getTime();
	    for(int i=0; i<a.length()-1; i++){
		if(!a.substring(i, i+1).equals(a.substring(i+1, i+2))){
		    String b = change(a, i, i+1);  
		    /*
		    int j=0;
		    while(j<pcnt && !pattern[j].equals(b)) j++;
		    if(pattern[j]==null){
			//System.out.println(b);
			pattern[j] = b;
			stack.in(b, t+1);
			pcnt++;
		    }
		    */
		    if(set.contains(b)) continue;
		    else{
			stack.in(b, t+1);
			set.add(b);
		    }
		}
	    }
	}
	if(color(a))
	    System.out.println(t);
	else
	    System.out.println("NA");
    }

    static boolean color(String x){
	String a = x.substring(0, 1);
	boolean ans = true;
	for(int i=0; i<x.length(); i++){
	    String y = x.substring(i, i+1);
	    ans = ans && a.equals(y);
	}
	return ans;
    }

    static String change(String x, int s, int e){
	String ans = "";
	for(int i=0; i<x.length(); i++){
	    if(i==s){
		String a = x.substring(i, i+1);
		i++;
		String b = x.substring(i, i+1);
		a = select(a, b);
		ans += a+a;
	    }
	    else{
		ans += x.substring(i, i+1);
	    }
	}
	return ans;
    }
	
    static String select(String x, String y){
	if(x.equals("r") || y.equals("r")){
	    if(y.equals("b") || x.equals("b")){
		return "g";
	    }
	    else return "b";
	}
	else return "r";
    }
}

class Stack {
    Worm[] stack = new Worm[60000];
    int sp;
    int out;
    public Stack(String s){
	sp = 0;
	out = 0;
	this.in(s, 0);
    }

    public  void in(String s, int t){
	Worm w = new Worm(s, t);
	stack[sp++] = w;
    }
    public Worm pop(){
	return stack[out++];
    }
    /*
    public String getb(){
	Worm a = (Worm)stack[sp-1];
	return a.getbody();
    }
    public  int gett(){
	Worm a = (Worm)stack[sp-1];
	sp--;
	return a.getTime();
    }
    */
    public boolean isEmpty(){
	return sp==out;
    }
}

class Worm{
    String body;
    int time;
    public  Worm(String s, int t){
	body = s;
	time = t;
    }
    public  String getbody(){
	return body;
    }
    public int getTime(){
	return time;
    }
}