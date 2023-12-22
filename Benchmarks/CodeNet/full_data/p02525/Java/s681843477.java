import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc;
	double sum=0;
	double i=1;
	double num;
	double heikin;
	double bunsan=0;
	ArrayList<Double> ar = new ArrayList<Double>();
	ArrayList<Double> hensa = new ArrayList<Double>();
	sc = new Scanner(System.in);
	 while(true){
		 i = sc.nextDouble();
		 if(i==0){
			 break;
		 }
		 else{
			 for(int k=0;k<i;k++){
		 num =sc.nextDouble();
		 ar.add(num);
		 sum += num;
			 }
			 heikin = sum/ar.size();
			 for(int n=0;n<ar.size();n++){
				 bunsan += (ar.get(n)-heikin)*(ar.get(n)-heikin);
			 }
			 bunsan = bunsan/ar.size();
			 hensa.add(Math.sqrt(bunsan));
			 ar.clear();
			 sum=0;
		 } 
	 }
	
	
	 
	for(int n=0;n<hensa.size();n++){
	 System.out.printf("%.8f\n",hensa.get(n));
	}
}
	
	
}