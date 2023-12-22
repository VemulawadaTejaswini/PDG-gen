import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


class Hill{
	public static void main(String[] args)throws IOException{
		int[] height=new int[10];
		String[] st=new String[10];

		File file=new File("in1.txt");
		BufferedReader br=new BufferedReader(new BufferedReader(new FileReader(file)));

		for(int i=0; i<10; i++){
			st[i]=br.readLine();
			height[i]=Integer.parseInt(st[i]);

			if(height[i]<0){
				height[i]*=-1;
			}
		}

		int a=0;		//a uses bubble sort


		for(int j=0; j<9; j++){
			for(int k=9; k>j; k--){
				if(height[k]<height[k-1]){
					a=height[k];
					height[k]=height[k-1];
					height[k-1]=a;

				}
			}
		}

		try{
			PrintWriter pw=new PrintWriter
					(new BufferedWriter(new FileWriter("out1.txt")));

			for(int l=0; l<3; l++){
				pw.println(height[9-l]);
			}
			pw.close();
		}

		catch(IOException e){
			System.out.println("err");
		}
	}
}