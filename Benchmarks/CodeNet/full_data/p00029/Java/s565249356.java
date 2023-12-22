import java.io.*;
import java.util.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String[] words=br.readLine().split(" ");
Hashmap<String,Integer> map=new Hashmap<String,Integer>();
int occured=0;
String occuredword="";
int maxlength=0;
String maxword="";
for(String word:words){
if(!map.containskey(word)){
map.put(word,1);
}
else{
map.put(word,map.get(word)+1);
}
if(map.get(word)>occured){
ocuured=map.get(word);
occueredword=word;
}
if(word.length()>maxlength){
maxlength=word.length();
maxword=word;
}
}
}
}