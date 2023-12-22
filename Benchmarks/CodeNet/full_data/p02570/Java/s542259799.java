import java.util.*;
public class Main {
    public static int a;
    public static int b;
    public static int c;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		float t_ds = (float)a/(float)c;
        if(b >= t_ds){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}