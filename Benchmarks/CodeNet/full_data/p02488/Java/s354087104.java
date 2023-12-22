// 10021 単語をn個読み込み、辞書順で最も小さいものを出力する。
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public  static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n);
	}
    }

    static void solve(int n){
	String[] word = new String[n];
	int i=0;
	for(i=0; i<n; i++){
	    word[i] = kbd.next();
	}
	sort(word);
	System.out.println(word[0]);
    }

    static void sort(String[] w){
	for(int i=0; i<w.length; i++){
	    for(int j=i+1; j<w.length; j++){
		if(w[i].compareToIgnoreCase(w[j]) > 0){
		    String x = w[i];
		    w[i] = w[j];
		    w[j] = x;
		}
	    }
	}
    }	
}