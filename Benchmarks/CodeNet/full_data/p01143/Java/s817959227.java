import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int m = kbd.nextInt();
	    double p = kbd.nextInt();
	    if(!(n==0 && m==0 && p==0)){
		
		int[] a = new int[n];
		int i;
		int  money = 0;
		for(i=0; i<n; i++){
		    a[i] = kbd.nextInt();
		    money += a[i]*100;
		}

		money -= money*(p/100);

		if(a[m-1]==0){
		    System.out.println("0");
		}
		else {
		    money = money/a[m-1];
		    System.out.println(money);
		}
	    }
	}
    }
}