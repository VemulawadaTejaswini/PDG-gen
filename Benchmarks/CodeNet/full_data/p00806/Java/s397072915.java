import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new D().doIt();
    }
    class D{
    	ArrayList<String> word = new ArrayList<String>();
    	ArrayList<String> wordnumber = new ArrayList<String>();
    	String word_num(String str,int length){
    		StringBuilder sb = new StringBuilder();
    		for(int i = 0;i < length;i++){
    			if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c')sb.append(2);
    			else if(str.charAt(i) == 'd' || str.charAt(i) == 'e' || str.charAt(i) == 'f')sb.append(3);
    			else if(str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'i')sb.append(4);
    			else if(str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l')sb.append(5);
    			else if(str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'o')sb.append(6);
    			else if(str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 's')sb.append(7);
    			else if(str.charAt(i) == 't' || str.charAt(i) == 'u' || str.charAt(i) == 'v')sb.append(8);
    			else sb.append(9);
    		}
    		return sb.toString();
    	}
    	class Set{
    		int index;
    		String sb;
    		public Set(int index,String sb){
    			this.index = index;
    			this.sb = sb;
    		}
    	}
    	ArrayList<Set> set = new ArrayList<Set>();
    	void clear(){
    		word.clear();
    		wordnumber.clear();
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			clear();
    			for(int i = 0;i < n;i++){
    				word.add(sc.next());
    				wordnumber.add(word_num(word.get(i),word.get(i).length()));
//    				System.out.println(word.get(i)+" "+wordnumber.get(i));
    			}
    			String str = sc.next();
    			set.add(new Set(0,""));
    			while(set.size() > 0){
    				Set s = set.remove(0);
//    				System.out.println(s.sb);
    				if(s.index == str.length()){
    					System.out.println(s.sb.trim()+".");
    					continue;
    				}
    				for(int i = 0;i < word.size();i++){
    					String wn = wordnumber.get(i);
    					String wn2 = word.get(i);
    					if(str.charAt(s.index) == wn.charAt(0)){
    						if(wn.length() <= str.length() - s.index){
    							boolean check  = true;
    							for(int j = 0;j < wn.length();j++){
    								if(str.charAt(s.index+j) != wn.charAt(j))check = false;
    							}
    							if(check){
    								set.add(new Set(s.index+wn.length(),s.sb + wn2+" "));
    							}
    						}
    					}
    				}
    			}
    			System.out.println("--");
    		}
    	}
    }
}