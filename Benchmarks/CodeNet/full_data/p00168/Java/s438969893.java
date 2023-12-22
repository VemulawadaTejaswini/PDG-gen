import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    while(true){
		int in = s.nextInt();
		if(in==0)break;
		System.out.println(1+(int)(call(in)/3650));
	    }
      	}
	    static int call(int in){
		if(in==0)
		    return 0;
		if(in==1)
		    return 1;
		if(in==2)
		    return 2;
		if(in==3)
		    return 4;
		else
		    return call(in-3)+call(in-2)+call(in-1);
	    }
}