import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int x = stdIn.nextInt();
	int a = stdIn.nextInt();
	int b = stdIn.nextInt();
	if(Math.abs(x-a)>Math.abs(x-b)){
	    System.out.println("B");
	}else{
	    System.out.println("A");
	}
    }
}
