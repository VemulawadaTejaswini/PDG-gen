
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double t;
        List<Double> a = new ArrayList<Double>();

        Double ave=0.0;
        //個々の数値-平均の合計
        double sum=0;
        while(true){
        	t = sc.nextDouble();
        	if (t==0) break;
        	int b[]=new int[1000];
        	for (int i=0; i < t; i++) {
        		b[i] = sc.nextInt();
        		ave += b[i];
        	}
        	ave = ave /t;
        	for (int j=0; j < t; j++) {
        		sum +=(b[j] - ave)*(b[j] - ave);
        	}
        	a.add(new Double(Math.sqrt(sum/t)));
        	ave=0.0;
        	sum=0;
        }
        sc.close();
        for (int l=0; l < a.size(); l++) {
        	System.out.println(a.get(l));
        }
    }
}

