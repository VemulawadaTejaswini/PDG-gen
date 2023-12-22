import java.io.*;
public class Main {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int[] list=new int[10];
		int top=0;
		while(str!=null){
			int num=Integer.parseInt(str);
			if(num==0){
				System.out.println(list[top-1]);
				top--;
			}else{
				list[top]=num;
				top++;
			}
			str=br.readLine();
		}
	}
}