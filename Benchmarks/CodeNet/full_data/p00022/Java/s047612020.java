import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				int n = scan.nextInt();
				if(n == 0)break;
				List<Integer> dataset = new ArrayList<Integer>();
				for(int i = 0; i < n;i++)
					dataset.add(scan.nextInt());
				int max = dataset.get(0);
				for(int i = 0; i < n ;i++){
					for(int j = i; j < n;j++){
						int sum = 0;
						for(int k =i; k <= j;k++){
							sum += dataset.get(k);
						}
						max = Math.max(sum, max);
					}
				}
				System.out.println(max);
			}
		}finally{
			scan.close();
		}

	}
}