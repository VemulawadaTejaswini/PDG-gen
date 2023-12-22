import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
  
class Main{
  
static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PriorityQueue<Integer> pque=new PriorityQueue<Integer>(10,new Comparator<Integer>(){
@Override
public int compare(int n1,int n2){
return n1>n2?1:n1<n2?-1:0;
}
});
int n;
while(true){
StringTokenizer st=new StringTokenizer(br.readLine());
String command=st.nextToken();
if("insert".equals(command)){
n=Integer.parseInt(st.nextToken());
pque.offer(n);
}
else if("end".equals(command)) break;
else out.println(pque.poll());
}
out.flush();
}
}