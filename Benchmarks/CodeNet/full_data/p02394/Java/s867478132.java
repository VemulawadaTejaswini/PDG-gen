import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int W = s.nextInt();
	int H = s.nextInt();
	int x = s.nextInt();
	int y = s.nextInt();
	int r = s.nextInt();

	int flag = 0;

	if(x-r >= 0 && x+r <= W){
	    if(y-r >= 0 && y+r <= H) flag = 1;
	}

	if(flag == 1) System.out.println("Yes");
	else System.out.println("No");
    }
}

