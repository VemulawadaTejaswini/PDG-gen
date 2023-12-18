import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		while(in.hasNext()){
			input.add(in.next());
		}
		String s=input.get(0);
		String[] s2=s.split("");
		String a="";
		for (int i=0;i<s.length();i=i+2)a+=s2[i];
		System.out.println(a);
	}
}