import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int i;
		boolean key = false; //falseテ」ツ?ェテ」ツつ嘉ヲツ鳴ステゥツ個?」ツ?陛」ツつ古」ツ?ヲテ」ツ??」ツつ?
		String[] id = new String[n];
		for(i=0; i<n; i++){
		    id[i] = kbd.next();
		}
		int m = kbd.nextInt();
		while(m>0){
		    String x = kbd.next(); // テヲツ督催、ツスツ愿」ツ?療」ツ?櫑D
		    boolean c = false; //trueテ」ツ?ェテ」ツつ嘉ヲツュツ」テ」ツ?療」ツ?ИD
		    for(i=0; i<n; i++){
			if(x.equals(id[i])) {
			    c = true; break;
			}
		    }
		    
		    if(c){
			if(!key){
			    System.out.println("Opened by "+x);
			    key = true;
			}
			else{
			    System.out.println("Closed by "+x);
			    key = false;
			}
		    }
		    else{
			System.out.println("Unknown "+x);
		    }
		    m--;
		}
	    }
	}
    }
}