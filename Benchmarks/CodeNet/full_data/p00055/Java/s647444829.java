import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double a=sc.nextDouble();
			double answer=a;
			for(int i=0;i<9;i++){
				if(i%2==0){
					a*=2;
				}else{
					a/=3;
				}
				answer+=a;
			}
			System.out.println(answer);
		}
	}
}