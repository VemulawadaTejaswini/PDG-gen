import java.util.*;

public class Main{
    public static void main(String[] args){
	int n=1;
	Scanner a = new Scanner(System.in);
	int x = a.nextInt();
	int y = a.nextInt();
	for(int i=2; i<x && i< y; i++){
	    if(x%i == 0 && y%i == 0){
		n = i;
	    }
	}
	System.out.println(n);
    }
}

