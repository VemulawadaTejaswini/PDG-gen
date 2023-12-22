import java .util.Scanner;
 
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.next());
    	int w = Integer.parseInt(sc.next());
    
 		if(w >= s){
     	 	System.out.println("unsafe");
    	}else{
      		System.out.println("safe");
    	}
    }
}