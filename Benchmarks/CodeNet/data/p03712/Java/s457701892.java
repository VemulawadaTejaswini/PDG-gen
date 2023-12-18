import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int h=sc.nextInt();
int w=sc.nextInt();
char[][] ch=new char[h+2][w+2];
for(int i=0;i<=h+1;i++){
    for(int j=0;j<=w+1;j++){
        ch[i][j]='#';
    }
}for(int i=1;i<=h;i++){
    for(int j=1;j<=w;j++){
        ch[i][j]=sc.next().charAt(0);
    }
}
for(int i=0;i<=h+1;i++){
    for(int j=0;j<=w+1;j++){
        System.out.print(ch[i][j]);
    }System.out.println();}
}}