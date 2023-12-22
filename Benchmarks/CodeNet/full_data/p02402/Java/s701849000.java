import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int n=Integer.parseInt(str);
		
		
		String[] a=br.readLine().split(" ");
		int min=Integer.parseInt(a[0]),max=Integer.parseInt(a[0]),sum=0;
		for(int i=0;i<n;i++){
			sum+=Integer.parseInt(a[i]);
			if(min>Integer.parseInt(a[i])){
				min=Integer.parseInt(a[i]);
			}
			if(max<Integer.parseInt(a[i])){
				max=Integer.parseInt(a[i]);
			}
		}
		System.out.println(min+" "+max+" "+sum);
	}
}