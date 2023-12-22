import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n=Integer.parseInt(str);
		String xstr=br.readLine();
		String ystr=br.readLine();
		String[] x=xstr.split(" ");
		String[] y=ystr.split(" ");
		int p=1;
		int[] t=new int[n];
		double dis=0;
		long ln=0;
		for(int i=0;i<n;i++){
			int l=Integer.parseInt(x[i]);
			int q=Integer.parseInt(y[i]);
		if(l>q)
		t[i]=l-q;
		else
		t[i]=q-l;
		ln+=Math.pow(t[i],p);}

		dis=Math.pow(ln,1/p);



		System.out.printf("%.6f%n",dis);}}
	
	