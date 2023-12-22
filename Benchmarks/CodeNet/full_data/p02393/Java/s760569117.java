import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	int a,b,c,v;
	String s = buf.readLine();
	String[] strlAry =s.split(" ");
	for(int i=0;i<strlAry.length;i++){
	}
	a= Integer.parseInt(strlAry[0]);
	b= Integer.parseInt(strlAry[1]);
	c= Integer.parseInt(strlAry[2]);

	if(a<b){
		if(b<c){
			System.out.println(a+" "+b+" "+c);
		}
		else{
			System.out.println(c+" "+a+" "+b);
		}
	}
	else if(b<c){
		if(c<a){
			System.out.println(b+" "+c+" "+a);
		}
		else{
			System.out.println(b+" "+a+" "+c);
		}
	}
	else{
		if(a<c){
			System.out.println(a+" "+c+" "+b);
		}
		else{
			System.out.println(c+" "+b+" "+a);
		}
	}
	}
}