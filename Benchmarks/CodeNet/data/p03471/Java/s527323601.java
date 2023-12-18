import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  num = sc.nextInt();
	int  yen = sc.nextInt();
	int x =0;
	int y = 0;
	int z = 0;
	x = yen /10000;
	if(x <= num){
		yen %= 10000;
		y = yen / 5000;
		if(x+y <= num){
			yen %= 5000;
			z = yen / 1000;
			yen %= 1000;
			if(x+y+z <= num && yen == 0){
				System.out.println(x +" "+ y + " " + z);
			}else{
				System.out.println("-1 -1 -1");
			}
		}else{
			System.out.println("-1 -1 -1");
		}
	}else{
    System.out.println("-1 -1 -1");
	}
  }
}