import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x=0,y=0,count=0;

	while(sc.hasNext()){
	    count = 0;

	    x = sc.nextInt();
	    y = sc.nextInt();
	    if(x == 0 && y == 0) break;

	    int t;
	    while(y!=0){
		x = x%y;
		t = y;
		y = x;
		x = t;
		count++;
	    }

	    System.out.println(x +" "+ count);
	}
    }
}