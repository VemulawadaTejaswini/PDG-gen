import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] dic = new char[128];
        dic['b'] = 'd'; dic['d']='b';
        dic['p'] = 'q'; dic['q']='p';
        char[] a = new char[n];
        for(int i=0;i<n;i++) a[i]=s.charAt(n-1-i);
        for(int i=0;i<n;i++) a[i]=dic[a[i]];
        String ans = s.equals(new String(a))?"Yes":"No";
        System.out.println(ans);
    }
}

