import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = x/(y+z);
        sum = sum+(x-(y+z)*sum)/y;
        System.out.println(sum);
	}
}