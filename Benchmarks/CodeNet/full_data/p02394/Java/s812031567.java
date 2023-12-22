import java.util.Scanner;
public class Main{

    int W,H,x,y,r;


    public void input(){
	Scanner scan = new Scanner(System.in);
	W = scan.nextInt();
	H = scan.nextInt();
	x = scan.nextInt();
	y = scan.nextInt(); 
	r = scan.nextInt();



    }
    public void output(){
 
	if((x - r)< 0  || (x + y)> W){
	    System.out.println("No");
	}
        if((x - r)>= 0 && (x + y)<= W){
            System.out.println("Yes");
	}
      



    }
    public static void main(String[] args){
	Main  p = new Main();
	p.input();
	p.output();
    }
}
 