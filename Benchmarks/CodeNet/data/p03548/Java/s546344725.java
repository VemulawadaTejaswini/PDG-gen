import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = x/(y+z);
        if((x-(y+z)*sum)/y >0) sum += 1;
        System.out.println(sum);
	}
}