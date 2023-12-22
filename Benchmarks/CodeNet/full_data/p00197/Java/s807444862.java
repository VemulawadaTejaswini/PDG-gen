import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int x, y, c, tmp;

    void run(){
	while(sc.hasNext()){
	    x = sc.nextInt();
	    y = sc.nextInt();
	    if(x==0 && y==0) break;
	    c = 0;

	    if(x<y){
		tmp = x;
		x = y;
		y = tmp;
	    }

	    while(y!=0){
		tmp = x%y;
		x = y;
		y = tmp;
		c++;
	    }

	    System.out.println(x+" "+c);
	}
    }
}