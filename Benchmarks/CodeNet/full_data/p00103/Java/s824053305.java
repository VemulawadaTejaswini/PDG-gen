import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int outCount=0;
			int runnerCount=0;
			int pointCount=0;
			while(outCount<3){
				String event=sc.next();
				if(event.equals("OUT")){
					outCount++;
				}
				if(event.equals("HIT")){
					runnerCount++;
					if(runnerCount>=4){
						pointCount++;
					}
				}
				if(event.equals("HOMERUN")){
					if(runnerCount>=4){
						pointCount+=4;
					}else{
						pointCount+=runnerCount+1;
					}
					runnerCount=0;
				}
			}
			System.out.println(pointCount);
		}
	}
}