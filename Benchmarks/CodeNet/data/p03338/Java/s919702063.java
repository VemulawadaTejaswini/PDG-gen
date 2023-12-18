import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int shurui=0,max=0;
int N=Integer.parseInt(sc.next());
String S=sc.next();
    for(int I=0;I<N;I++){
    String SS=S.substring(0,I+1);
    String SSS=S.substring(I+1,N);
    if(S.contains("a")&&SS.contains("a"))shurui++;
    if(S.contains("b")&&SS.contains("b"))shurui++;
    if(S.contains("c")&&SS.contains("c"))shurui++;
    if(S.contains("d")&&SS.contains("d"))shurui++;
    if(S.contains("e")&&SS.contains("e"))shurui++;
    if(S.contains("f")&&SS.contains("f"))shurui++;
    if(S.contains("g")&&SS.contains("g"))shurui++;
    if(S.contains("h")&&SS.contains("h"))shurui++;
    if(S.contains("i")&&SS.contains("i"))shurui++;
    if(S.contains("j")&&SS.contains("j"))shurui++;
    if(S.contains("k")&&SS.contains("k"))shurui++;
    if(S.contains("l")&&SS.contains("l"))shurui++;
    if(S.contains("m")&&SS.contains("m"))shurui++;
    if(S.contains("n")&&SS.contains("n"))shurui++;
    if(S.contains("o")&&SS.contains("o"))shurui++;
    if(S.contains("p")&&SS.contains("p"))shurui++;
    if(S.contains("q")&&SS.contains("q"))shurui++;
    if(S.contains("r")&&SS.contains("r"))shurui++;
    if(S.contains("s")&&SS.contains("s"))shurui++;
    if(S.contains("t")&&SS.contains("t"))shurui++;
    if(S.contains("u")&&SS.contains("u"))shurui++;
    if(S.contains("v")&&SS.contains("v"))shurui++;
    if(S.contains("w")&&SS.contains("w"))shurui++;
    if(S.contains("x")&&SS.contains("x"))shurui++;
    if(S.contains("y")&&SS.contains("y"))shurui++;
    if(S.contains("z")&&SS.contains("z"))shurui++;
    max=Math.max(shurui, max);
    }
System.out.println(max);
}
}