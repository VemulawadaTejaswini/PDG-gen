import java.util.Scanner; 
 
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int w = sc.nextInt();
	int[] values = new int[w + 1];
	int n = sc.nextInt();
	for(int i = 1; i < values.length; i++){
	    values[i] = i;
	}
	for(int i = 1; i <= n; i++){
	    String str = sc.next();
	    String[] ab = str.split(",");
	    int a = Integer.parseInt(ab[0]);
	    int b = Integer.parseInt(ab[1]);
	    int temp = 0;
	    temp = values[a];
	    values[a] = values[b];
	    values[b] = temp;
	}
	for(int i = 1; i < values.length; i++){
	    System.out.printf("%d\n", values[i]);
	}
    }
}