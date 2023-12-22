import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out;
static final BufferedReader br;

static class Dictionary{

ArrayList<String> array=new ArrayList<String>();

void insert(String str){
array.add(str);
}

boolean find(String str){
return (array.indexOf(str)<0)?false:true;
}
}

public static void main(String[] args) throws IOException{
out=new PrintWriter(System.out);
br=new BufferedReader(new InputStreamReader(System.in));
long start=System.currentTimeMillis();
solve();
long end=System.currentTimeMillis();
//out.println(end-start+"ms");
out.flush();
}

private static void solve(){
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
Dictionary d=new Dictionary();
for(int i=0;i<n;i++){
StringTokenizer st=new StringTokenizer(br.readLine());
String command=st.nextToken();
String str=st.nextToken();
if("insert".equals(str)){
d.insert(str);
}
if("find".equals(str)){
if(d.find(str)) out.println("yes");
else out.println("no");
}
}
}
}
}