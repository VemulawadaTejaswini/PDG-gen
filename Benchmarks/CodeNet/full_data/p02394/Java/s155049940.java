import java.util.*;

public class Main {
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] data = str.split(" ");
	int[] num = new int[data.length];
	
	for(int i = 0; i < data.length; i ++)
		num[i] = Integer.parseInt(data[i]);

	int W = num[0];
	int H = num[1];
	int x = num[2];
	int y = num[3];
	int r = num[4];

	boolean x1 = (x >= r) && (x <= W - r);
	boolean y1 = (y >= r) && (y <= H - r);
	if (x1 && y1){
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
    }
 
}
