import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] s = sc.nextLine().split(",");
			int[] values = new int[11];
			double[] v = new double[2];
			for(int i=0;i<11;i++){
				if(i == 0){
					values[i] = 0;
				}else{
					values[i] = Integer.parseInt(s[i-1]) + values[i-1];
				}
			}

			for(int i=0;i<2;i++){
				v[i] = Integer.parseInt(s[i+10]);
			}

			double temp = v[0] /(v[0] + v[1]);
			temp *= values[10];

			boolean flag = true;
			for(int i=0;i<10;i++){
				if(values[i] <= temp && temp <= values[i+1] && flag){
					System.out.println(i+1);
					flag = false;
				}
			}
		}
	}
}