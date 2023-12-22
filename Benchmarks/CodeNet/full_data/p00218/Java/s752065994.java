import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n,pm,pe,pj;
	while(stdIn.hasNextInt()){
	    n = stdIn.nextInt();
	    for(int i = 0;i < n;i++){
		pm = stdIn.nextInt();
		pe = stdIn.nextInt();
		pj = stdIn.nextInt();
		if(pm == 100 || pe == 100 || pj == 100){
		    System.out.println("A");
		}else if((pm + pe) / 2 >= 90){
		    System.out.println("A");
		}else if((pm + pe + pj) / 3 >= 80){
		    System.out.println("A");
		}else if((pm + pe + pj) / 3 >= 70){
		    System.out.println("B");
		}else if((pm + pe + pj) / 3 >= 50 && (pm >= 80 || pe >= 80)){
		    System.out.println("B");
		}else System.out.println("C");
	    }
	}
    }