import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);
    void run(){
	while(kbd.hasNext()){
	    int k = kbd.nextInt();
	    if(k==0) break;

	    int i;
	    long sum=0;
	    for(i=0; i<(k*(k-1)/2); i++)
		sum += kbd.nextInt();
	   
	    System.out.println(sum/(k-1));
	}
    }
}
	   