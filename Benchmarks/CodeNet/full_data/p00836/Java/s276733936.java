import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int[] p = new int[10000];
	putN(p);
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int i=0;
		int s=0;  //テゥツ?」テァツカツ堙」ツ?療」ツ?淌ァツエツ?ヲツ閉ーテ」ツ?ョテ・ツ陳?
		int l=0;  //テゥツ?」テァツカツ堙ァツエツ?ヲツ閉ーテ」ツ?ョテ」ツ??」ツ?。テヲツ慊?・ツーツ?
		int c = 0;  //ティツ。ツィテァツ渉セテ」ツ?ァテ」ツ?催」ツ?淌」ツδ妥」ツつソテ」ツδシテ」ツδウテヲツ閉ー
		while(p[i]!=0){
		    if(s < n) {
			s += p[i];
			i++;
		    }
		    else if(s>n){
			s -= p[l];
			l++;
		    }
		    else;

		    if(s==n) {
			c++;
			s += p[i];
			i++;
		    }
		}	 
		System.out.println(c);
	    }
	}
    }

    
    
    
    static void putN(int[] p){
	int i=0, k;
	for(k=2; k<10000; k++){
	    if(check(k)) {
		p[i] = k;
		//System.out.print(p[i]+" ");
		i++;
	    }
	}

    }
    static boolean check(int n){
	int a, c=0;
	for(a=1; a<=n; a++){
	    if(n%a==0) c++;
	}
	if(c>2) return false;
	return true;
    }    
}