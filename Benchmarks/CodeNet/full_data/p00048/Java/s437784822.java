import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double w=sc.nextDouble();
			if(w<=48){
				System.out.println("light fly");
			}else if(w<=51){
				System.out.println("fly");
			}else if(w<=54){
				System.out.println("bantam");
			}else if(w<=57){
				System.out.println("feather");
			}else if(w<=60){
				System.out.println("light");
			}else if(w<=64){
				System.out.println("light welter");
			}else if(w<=69){
				System.out.println("welter");
			}else if(w<=75){
				System.out.println("light middle");
			}else if(w<=81){
				System.out.println("middle");
			}else if(w<=91){
				System.out.println("light heavy");
			}else{
				System.out.println("heavy");
			}
		}
	}
}