import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	int[] a;
	public static void main(String []args){
		try{
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			line=br.readLine();
			StringTokenizer t1 = new StringTokenizer(line, " ");


		try{
			FileWriter fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			int w=0;
		while (true) {
			 //Scanner in = new Scanner(System.in);
			 //int num = in.nextInt();
			int num=Integer.parseInt(t1.nextToken());
			w++;
			 if(num==0)
				 break;
			 int[] a=new int[num];
			 int p=0;
			 int t=0;
			 int pre=0;
			 a[0]=num;
			 if(num==1){
				 bw.write("1\n");
			 }else{
			 for(;;){
				 for (int i=0;i<num-1;i++) {
					 //------出力------------
					 
					 if(a[0]==pre){
						 int h=lch(a,0,1);
						 int q=h;
						 for(int j=0;j<h;j++){
							 a[j]--;
							 if(a[q]==a[0])
								 q++;
							 a[q]++;
						 }
						 p=0;
						 t=0;
					 }
					 if(p==0 && pre!=a[0]){
					 for(int j=0;j<num;j++){
						 p=1;
						if(a[j]!=0)
							bw.write(""+a[j]+" ");
						else{
							bw.write("\n");
							if(a[num-a[0]]==1){
								pre=a[0];
								int h=1;
								for(int k=2;k<num;k++){
									a[h]=a[h]+a[k];
									a[k]=0;
									if(a[h]==a[0])
										h++;
								}
								t=1;
							}
							break;
						}
					 }
					 }
					 //----------------------
					 if(((a[i+1]+1)<=(a[i]-1) && a[i+1]<=1) || (t==1 && (a[i+1]+1)<=(a[i]-1))){
						 a[i]--;
						 a[i+1]++;
						 i=-1;
						 t=0;
						 p=0;
					 }else if(t==1){
				 	}else if(a[i+1]<=1 && a[i]>=2){
						 a[rch(a,i,i+1)]++;
						 a[i]--;
						 i=-1;
						 p=0;
					 }else if(a[i+1]<=1){
						 break;
					 }
				 }
				 if(a[num-1]==1)
					 bw.write("\n");
					 break;
			}
			 }
			 for (int i = 0; i < a.length; i++) {
				a[i]=0;
			}
		}
		bw.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
		br.close();
		
	}catch(FileNotFoundException e){
		System.out.println("Don't find your file.");
	}catch(IOException e){
		System.out.println(e);
	}

	}
	
	public static int rch(int[] a,int x,int y){
		if((a[x]-1)==a[y])
			return rch(a,x,y+1);
		else
			return y;		
	}
	public static int lch(int[] a,int x,int y){
		if(a[x]==a[y])
			return lch(a,x,y+1);
		else
			return y;		
	}
}