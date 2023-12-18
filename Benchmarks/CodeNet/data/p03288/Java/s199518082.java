import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int R = sc.nextInt();
	if(R < 1200) System.out.print("ABC");
	else if(R < 2800) System.out.print("ARC");
	else System.out.print("AGC");
    }
}
