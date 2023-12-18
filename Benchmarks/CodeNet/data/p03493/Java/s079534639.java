import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int a = stdIn.nextInt();
	int count=0;
	for(int i=0;i<2;i++){
	    int k=a%10;
	    if(k==1){
		count++;
	    }
	}
	System.out.println(count);
    }
}
