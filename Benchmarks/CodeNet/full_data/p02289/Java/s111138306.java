import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
  
class Main{
  
static final PrintWriter out=new PrintWriter(System.out);
 
static class MyComparator implements Comparator<Integer>{
public int compare(int n1,int n2){
return (n1>n2)?1:(n1<n2)?-1:0;
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PriorityQueue<Integer> pque=new PriorityQueue<Integer>(10,new MyComparator<Integer>());
int num=Integer.parseInt(br.readLine());
int n;
while(num-->0){
StringTokenizer st=new StringTokenizer(br.readLine());
String command=st.nextToken();
if("insert".equals(command)){
n=Integer.parseInt(st.nextToken());
pque.offer(n);
}
else out.println(pque.poll());
}
out.flush();
}
}