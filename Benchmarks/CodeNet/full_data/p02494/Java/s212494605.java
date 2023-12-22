import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	while(true){
	    int x = cin.nextInt();
	    int y = cin.nextInt();
	    if(x==0 && y==0)break;
	    for(int j=0;j<x;j++){
		for(int i=0;i<y;i++){
		    System.out.print("#");
		}
		System.out.print("\n");
	    }
	    System.out.print("\n");
	}
    }
}