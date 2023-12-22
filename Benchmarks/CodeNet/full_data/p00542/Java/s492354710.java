import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
int []t=new int[4];
int []t2=new int[2];
for(int i=0;i<4;i++)t[i]=sc.nextInt();
t2[0]=sc.nextInt();
t2[1]=sc.nextInt();
Arrays.sort(t);
System.out.println(t[3]+t[2]+t[1]+Math.max(t2[0],t2[1] ));
    }
}