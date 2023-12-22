import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int [] point = new int[2];
		double x = 0;
		double y = 0;
		int deg = 0;
		while(true){
			String str = sc.next();
			if(str.equals("0,0"))
				break;

			String [] input = str.split(",");
			for(int i=0; i < 2; i++){
				point[i] = Integer.parseInt(input[i]);
			}
			x += Math.sin(Math.PI * deg / 180) * point[0];
			y += Math.cos(Math.PI * deg / 180) * point[0];
			deg = deg + point[1];
		}
		System.out.printf("%d\n%d\n",(int)x,(int)y);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}