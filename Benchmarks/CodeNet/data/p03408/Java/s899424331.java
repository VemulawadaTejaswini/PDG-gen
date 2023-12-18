import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
HashMap<String,Integer> U=new HashMap<>();
String[] s=new String[n];
for(int i=0;i<n;i++){s[i]=sc.next();U.put(s[i],0);}
int m=Integer.parseInt(sc.next());
String[] t=new String[m];
for(int i=0;i<m;i++){t[i]=sc.next();U.put(t[i],0);}
for(int i=0;i<n;i++){
    int c=U.get(s[i]);
    c++;
    U.put(s[i],c);
}
for(int i=0;i<m;i++){
    int c=U.get(t[i]);
    c--;
    U.put(t[i],c);
}
int max=0;
for(String str:U.keySet()){
max=Math.max(max,U.get(str));
}
System.out.println(max);
}}