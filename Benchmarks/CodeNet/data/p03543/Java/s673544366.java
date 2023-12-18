import java.util.*;

public class Main{
    public static void main(String args[]){
	int N[4];
	int i;
	int count;
	Scanner scan = new Scanner(System.in);
	for(i=0;i<4;i++){
	    N[i] = scan.nextInt();
	}
	for(i=1;i<4;i++){
	    if(N[i]=N[i-1]){
		count++;
	    }
	}
	if(count>=3){
	    println("yes");
	}
	else{
	    println("No");
	}
    }
}