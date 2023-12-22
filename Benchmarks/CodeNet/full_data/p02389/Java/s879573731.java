
  import java.util.Scanner;
public class Main{

    int a,b;

    public void input(){
	Scanner scan = new Scanner(System.in);
       a = scan.nextInt();
       b = scan.nextInt();
        
    }
 


    public void output(){
	System.out.print(a*b+" ");
        System.out.println(2*a+2*b);
    }
 public static void main(String[] args){
     Main p = new Main();
     p.input();
     p.output();
 }
}
  