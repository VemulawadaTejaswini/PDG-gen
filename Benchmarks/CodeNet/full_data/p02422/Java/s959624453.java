import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String dat=br.readLine();
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String[] a=br.readLine().split(" ");
			dat=ans(a,dat);
			
		}
	
	}	
	public static String ans(String[] array,String src){
		if (array[0].equals("print")){
			int p=Integer.parseInt(array[1]);
			int q=Integer.parseInt(array[2]);
			System.out.println(src.substring(p,q+1));
		}else if(array[0].equals("reverse")){
			int p=Integer.parseInt(array[1]);
			int q=Integer.parseInt(array[2]);
			char temp;
			char[] csrc=src.toCharArray();
			while(q>p){
				temp=csrc[p];
				csrc[p]=csrc[q];
				csrc[q]=temp;
				p++;q--;
			}
			src=String.valueOf(csrc);
		}else{
			int p=Integer.parseInt(array[1]);
			int q=Integer.parseInt(array[2]);
			char[] csrc=src.toCharArray();
			char r;
			for(int i=0;i+p<=q;i++){
				r=array[3].charAt(i);
				csrc[i+p]=r;
			}
			src=String.valueOf(csrc);
		}
		return src;
	}
}