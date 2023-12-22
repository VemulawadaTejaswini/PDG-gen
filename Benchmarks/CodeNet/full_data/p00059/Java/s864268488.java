import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		double[] point = new double[8];
		while(scan.hasNext()){
			for(int i = 0;i < 8;i++){
				point[i] = scan.nextDouble();
			}
			if(Math.max(point[0],point[2]) < Math.min(point[4],point[6])
					|| Math.min(point[0],point[2]) > Math.max(point[4],point[6])
					|| Math.max(point[1],point[3]) < Math.min(point[5],point[7])
					|| Math.min(point[1],point[3]) > Math.max(point[5],point[7])){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}