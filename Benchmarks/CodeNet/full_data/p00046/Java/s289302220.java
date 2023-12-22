import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = -1;
		double min = 999999;
		Double hight ;
		String h = sc.next();
		try {
			if(h != null){
				hight = Double.parseDouble(h);
				if(max < hight) max = hight;
				if(min > hight) min = hight;
			}else{
				System.out.println(max - min);
			}
		} catch (Exception e) { }
	}
}