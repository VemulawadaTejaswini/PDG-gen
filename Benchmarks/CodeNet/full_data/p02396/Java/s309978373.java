import java.util.Scanner;
public class Main{

    int data,x;



    public void input(){
	Scanner scan = new Scanner(System.in);
	x = 1;
        while(true){
	    data = scan.nextInt();
	    if ( data == 0 ) break;
	    output();
	    x = x + 1;
	}
    }
    public void output(){
	System.out.println("Case "+x+":"+" "+data);
    }
    



    public static void main(String[] args){
	Main  p = new Main();
	p.input();
	//	p.output();
    }
}
 