import java.util.*;

public class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
	int a = 0;
	boolean tf = true;

	for(int i=x;i>0;i--){

	    if(tf == false) break;
	    
	    for(int j=1;j<=i;j++){
		
		a = j;
		
		for(int k=1;k<=a;k++){

		    a = a * a;

		    if(i == a){
			System.out.println(a);
			tf = false;
		    }
		}
	    }
	}
    }
}
