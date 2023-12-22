import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args)throws IOException {
    	InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
int n=Integer.parseInt(br.readLine()); int []p=new int[n];
int m=Integer.parseInt(br.readLine()); int []t=new int[m];
String[] ts = br.readLine().split(" ");
for(int i=0;i<m;i++)t[i]=Integer.parseInt(ts[i]);
for(int i=0;i<m;i++){
	String[] ps = br.readLine().split(" ");
	for(int j=0;j<n;j++){
		if(Integer.parseInt(ps[j])==t[i]){p[j]++;}else  p[t[i]-1]++;
	}
}
for(int i=0;i<n;i++)System.out.println(p[i]);
br.close();
    }
}