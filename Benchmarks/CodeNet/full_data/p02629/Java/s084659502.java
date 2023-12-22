//package  com.company;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder ans=new StringBuilder();
        long n=sc.nextLong();
        while(n>0){
            n--;
            ans.append((char) ((n % 26) + 'a'));
            n/=26;
        }
        System.out.println(ans.reverse().toString());

    }
}