import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int shurui,max=0;
int N=Integer.parseInt(sc.next());
String S=sc.next();
    for(int I=0;I<N;I++){
    String SS=S.substring(0,I+1);
    String SSS=S.substring(I+1,N);
    shurui=0;
    for(char j='a';j<='z';j++){
        String k=String.valueOf(j);
    if(SSS.contains(k)&&SS.contains(k))shurui++;
    }
    max=Math.max(shurui, max);
    }
System.out.println(max);
}
}