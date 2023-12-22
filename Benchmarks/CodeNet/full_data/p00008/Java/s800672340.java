import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }

    public static void solve(){
	int n = kbd.nextInt();
	int i, j, k;
	int cnt=0;
	for(i=0; i<10; i++){
	    for(j=i; j<10; j++){
		for(k=j; k<10; k++){
		    int x = n-i-j-k;
		    if(x<=i && x>=0) cnt++;
		}
	    }
	}
	System.out.println(cnt*4);
    }
}