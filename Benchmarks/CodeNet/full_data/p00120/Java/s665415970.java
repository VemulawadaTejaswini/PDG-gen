import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Sample0120 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		while(sc.hasNext()){
			int box = sc.nextInt();
			LinkedList<Integer> array = new LinkedList<Integer>();
			while(sc.hasNextInt())
				array.push(sc.nextInt());

			double[][] data = new double[(1<<array.size())][array.size()];

			for(int i=0;i<1<<array.size();i++)
				Arrays.fill(data[i], Double.MAX_VALUE);

			for(int i=0;i<array.size();i++)
				data[1<<i][i]=array.get(i);

			for(int i=0;i<1<<array.size();i++){
				for(int j=0;j<array.size();j++){
					int tmp = 1<<j;
					if((i&tmp)==0){
						for(int k=0;k<array.size();k++){
							double x = (double)array.get(j);
							double y = (double)array.get(k);
							data[i|tmp][j]=Math.min(data[i][k]+Math.sqrt((x+y)*(x+y)-(x-y)*(x-y)),data[i|tmp][j]);
						}
					}
				}
			}

			double min = Double.MAX_VALUE;

			for(int i=0;i<array.size();i++){
				data[(1<<array.size())-1][i]+=array.get(i);
				min = Math.min(min,data[(1<<array.size())-1][i]);
			}

			if(min<(box+1e-8)){
				System.out.println("OK");
			}
			else
				System.out.println("NA");
		}
	}
}