import java.util.Scanner;
public class Main{

    int x,y;
 



    public void input(){
	Scanner scan = new Scanner(System.in);
	while(true){

	x = scan.nextInt();
        y = scan.nextInt();

	if(x == 0 && y == 0)break;
        output();
	}
	

    }
    public void output(){
     
	if(x < y){
	    System.out.println(x+" "+y);
      	}else{
	    System.out.println(y+" "+x);

		}



    }
    



    public static void main(String[] args){
	Main  p = new Main();
	p.input();
	//  	p.output();
    }
}
 