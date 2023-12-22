import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String[] a=null;
		int n=0,x=0,count=0;
        while(true){
        	a=br.readLine().split(" ");
            n=Integer.parseInt(a[0]);
            x=Integer.parseInt(a[1]);
            if(n==0&&x==0) break;
            count=0;
        	for(int i=n;i>0;i--){
            	for(int j=i-1;j>0;j--){
            		int k=x-i-j;
            		if(k<=n && k!=i && k!=j && 0<k && k<j) count++;
            	}
        	}
        	sb.append(count+"\n");
        }
    	System.out.print(sb);
	}
}