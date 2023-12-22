import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	while(sc.hasNext()){
	    System.out.println(sc.nextDouble()*sc.nextDouble()/3.305785);
	}
    }
}