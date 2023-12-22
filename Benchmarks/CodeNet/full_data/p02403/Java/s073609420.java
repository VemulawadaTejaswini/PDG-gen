import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        String str;
        int a,b;
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0)System.exit(0);
            str="";
            for(i=0;i<b;i++)str=str+"#";
            for(i=0;i<a;i++)System.out.println(str);
            System.out.println();
        }
   }
}
