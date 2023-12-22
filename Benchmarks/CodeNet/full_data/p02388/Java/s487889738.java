import java.util.Scanner;
public class Main{

    int x;

    public void input(){
	Scanner scan = new Scanner(System.in);
       x = scan.nextInt();
        
    }
 


    public void output(){
	System.out.println(x*x*x);
    }
 public static void main(String[] args){
     Main p = new Main();
     p.input();
     p.output();
 }
}
  