import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }
    
    static void solve(){
	int[] num = new int[5];
	int i;
	for(i=0; i<num.length; i++){
	    num[i] = kbd.nextInt();
	}
	sort(num);
	for(i=0; i<num.length; i++){
	    System.out.print(num[i]);
	    if(i+1<num.length){
		System.out.print(" ");
	    }
	}
	System.out.println();
    }

    static void sort(int[] num){
	int i, j;
	for(i=0; i<num.length; i++){
	    for(j=i+1; j<num.length; j++){
		if(num[i]<num[j]){
		    int w = num[i];
		    num[i] = num[j];
		    num[j] = w;
		}
	    }
	}
    }
}