import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = kbd.nextInt();
	while(n>0){
	    solve();
	    n--;
	}
    }

    static void solve(){
	String train = kbd.next();
	String[] part = new String[(train.length()-1)*8];
	String a, b, c, w;
	int i, k=0, cnt=0;

	for(i=1; i<train.length(); i++){
	    a = train.substring(0, i);
	    b = train.substring(i, train.length());
	    //System.out.println(a+" "+b);
	    w = a;

	    c = a+b;        //反転なし
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    }
	    c = b+a;        //反転なし
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    }

	    a = reverse(a);
	    c = a+b;        // aのみ反転
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    }
	    c = b+a;        // aのみ反転
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    }

	    b = reverse(b);
	    c = w+b;        // bのみ反転
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    } 
	    c = b+w;        // bのみ反転
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    }

	    c = a+b;        // a,bともに反転
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    }
	    c = b+a;        // a,bともに反転
	    if(! isExist(part, c)){
		part[k] = c;
		cnt++; k++;
	    }
	}
	/*
	for(i=0; part[i]!=null; i++){
	    System.out.println(part[i]);
	}
	*/
	System.out.println(cnt);
    }

    static String reverse(String a){
	String[] p = new String[a.length()];
	int i;
	for(i=0; i<a.length(); i++){
	    p[i] = a.substring(i, i+1);
	}
	a = "";
	for(i=p.length-1; i>=0; i--){
	    a += p[i];
	}
	return a;
    }

    static boolean isExist(String[] part, String x){
	int i;
	for(i=0; i<part.length; i++){
	    if(x.equals(part[i])) return true;
	}
	return false;
    }
}