import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

//		Scanner scan = new Scanner(System.in);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
			//int n=scan.nextInt();//int?????????int???????????????????????§?????????????????????
			String t=reader.readLine();
			String s=reader.readLine();//String????????????????????????????????????
			int n=Integer.parseInt(t);
			String[] str =s.split(" ");//
			int array_num[]= new int[n];
			long max, min, sum;
			sum=0;
			max=-1000000;
			min=1000000;

			for(int i=0;i<n;i++){
				array_num[i]=Integer.parseInt(str[i]);
				sum+=array_num[i];

				if(array_num[i]>max)max=array_num[i];
				if(array_num[i]<min)min=array_num[i];
			}

			System.out.println(min+" "+max+" "+sum);



	//		scan.close();
			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}