import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int max = 0;
		int min = 500;
		int a;
		while(n>0){
		    int point = 0;
		    for(int i=0; i<5; i++){
			a = kbd.nextInt();
			point += a;
		    }
		    if(max < point) max = point;
		    if(min > point) min = point;
		    n--;
		}
		System.out.println(max+" "+min);
	    }
	}
    }
}