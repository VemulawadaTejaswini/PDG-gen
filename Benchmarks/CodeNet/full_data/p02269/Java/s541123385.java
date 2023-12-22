import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

static class Dictionary{

HashSet<String> set=new HashSet<String>();

void insert(String str){
set.add(str);
}

boolean find(String str){
return set.contains(str);
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
Dictionary d=new Dictionary();
for(int i=0;i<n;i++){
StringTokenizer st=new StringTokenizer(br.readLine());
String command=st.nextToken();
String str=st.nextToken();
if("insert".equals(command)){
d.insert(str);
}
else{
if(d.find(str)) out.println("yes");
else out.println("no");
}
}
}
out.flush();
}
}