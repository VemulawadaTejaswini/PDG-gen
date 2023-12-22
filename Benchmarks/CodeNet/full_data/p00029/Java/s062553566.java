import java.io.*;
import java.util.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String[] words=br.readLine().split(" ");
HashMap<String,Integer> map=new HashMap<String,Integer>();
int maxoccured=0;
String maxoccuredword="";
int maxlength=0;
String maxlengthword="";
for(String word:words){
if(!map.containsKey(word)){
map.put(word,1);
}
else{
map.put(word,map.get(word)+1);
}
if(map.get(word)>maxoccured){
maxoccured=map.get(word);
maxoccuredword=word;
}
if(word.length()>maxlength){
maxlength=word.length();
maxlengthword=word;
}
}
System.out.println(maxoccuredword+" "+maxlengthword
}
}