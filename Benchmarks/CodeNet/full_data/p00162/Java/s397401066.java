import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public  static void main(String[] args){
	while(kbd.hasNext()){
	    int m = kbd.nextInt();
	    if(m!=0){
		solve(m);
	    }
	}
    }

    static void solve(int m){
	int six = 60;
	int n = kbd.nextInt();
	int cnt = 0;
	for(; m<=n; m++){
	    //System.out.println(m);
	    while(six < m){ six*=60; }
	    if(m==1);
	    if(six%m == 0){ 
		//System.out.println(m);
		cnt++;
	    }
	    else{
		int a = m;
		while(a>0 && a%2==0){ a/=2; }
		while(a>0 && a%3==0){ a/=3; }
		while(a>0 && a%5==0){ a/=5; }

		if(a==1){ 
		    //System.out.println(m);
		    cnt++; 
		}
	    }
	}
	System.out.println(cnt);
    }
}