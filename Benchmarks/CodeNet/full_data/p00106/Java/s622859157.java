import java.io.IOException;
import java.util.Scanner;


public class AOJ0106 {
	public static int[] A={200,380,5,20};
	public static int[] B={300,550,4,15};
	public static int[] C={500,850,3,12};
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			for(;;){
				int d =scan.nextInt();
				if(d ==0)break;
				System.out.println(Math.min(calc(d,A),Math.min(calc(d,B), calc(d,C))));
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
	public static int calc(int size,int[] data){
		int fukuro = size / data[0];
		if(size%data[0] !=0)fukuro++;
		int nokori = fukuro % data[2];
		int waribiki = fukuro -nokori;
		int nedan = waribiki * data[1] *(100 - data[3]) /100 + nokori * data[1];
		return nedan;
	}

}