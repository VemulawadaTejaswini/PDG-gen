//package  com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int ans=0;
        for(int i=0;i<n;++i){
            ans+=s1.charAt(i)!=s2.charAt(i)?1:0;
        }
        System.out.println(ans);
    }
}