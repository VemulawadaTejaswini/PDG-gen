import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n=Integer.parseInt(str);
		
		String[] a=br.readLine().split(" ");
		int min=1000000,max=1000000,ai=0;
		long sum=0;
		for(int i=0;i<n;i++){
			ai=Integer.parseInt(a[i]);
			sum+=ai;
			if(min>ai){
				min=ai;
			}
			if(max<ai){
				max=ai;
			}
		}
		System.out.println(min+" "+max+" "+sum);
	}
}