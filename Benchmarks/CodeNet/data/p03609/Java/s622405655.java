import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Long iix = sc.nextLong();
		Long iit = sc.nextLong();
		if(iix<=iit){
			System.out.println(0);
		}
		else{
			System.out.println(iix-iit);
		}
    }
}