import java.io.*;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int ans=0;
int n=Integer.parseInt(line);
int[] a=new int[n];
StringTokenizer st1=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) a[i]=Integer.parseInt(st1.nextToken());
int m=Integer.parseInt(br.readLine());
StringTokenizer st2=new StringTokenizer(br.readLine());
for(int i=0;i<m;i++){
int b=Integer.parseInt(st2.nextToken());
if(BinarySearch(a,b)>=0) ans++;
}
out.println(ans);
out.flush();
}
}

private static int BinarySearch(int[] a,int b){
int lb=0;
int ub=a.length;
while(ub>lb){
int mid=(lb+ub)/2;
if(a[mid]==b) return mid;
else if(a[mid]>b) ub=mid;
else lb=mid+1;
}
return -1;
}
}