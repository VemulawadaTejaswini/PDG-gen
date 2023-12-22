import java.io.*;
class Main{
	public static int height[]=new int[10];
	public static void liner(){
		int num;
		for(int i=0;i<=9;i++){
			for(int j=i+1;j<=9;j++){
				if(height[i]<=height[j]){
					num=height[i];
					height[i]=height[j];
					height[j]=num;
				}
			}
		}
		for(int i=0;i<=2;i++)
			System.out.println(height[i]);
	}

	public static void main(String[] a) throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<=9;i++){
			height[i]=Integer.parseInt(in.readLine());
		}
				
		liner();
	}
}