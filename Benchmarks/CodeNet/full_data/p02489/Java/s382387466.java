import java.util.*;
class Main{
    public static void main(String args[]){
	int i=1;
	int x=1;
	while(x!=0){
	    Scanner cin = new Scanner(System.in);
	    x = cin.nextInt();
	    if(x!=0){
		System.out.println("Case "+i+": "+x);
		i++;
	    }
	}
    }
}