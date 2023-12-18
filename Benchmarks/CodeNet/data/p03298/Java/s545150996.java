import java.util.*;

public class Main{
    static StringBuffer aka = new StringBuffer();
    static StringBuffer ao = new StringBuffer();
    static long count=0;
    static void DFS(String s, int i){
        int index=0;
        char c = ' ';
        if(i==s.length()){
            if(aka.toString().equals(ao.reverse().toString())){
                count++;
            }
            ao.reverse();
            return;
        }
        c = s.charAt(i);
        aka.append(s.charAt(i));
        DFS(s, i+1);
        index = aka.lastIndexOf(String.valueOf(c));
        aka.deleteCharAt(index);
        ao.append(s.charAt(i));
        DFS(s, i+1);
        index = ao.lastIndexOf(String.valueOf(c));
        ao.deleteCharAt(index);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        DFS(S, 0);
        System.out.println(count);
        sc.close();
    }
}