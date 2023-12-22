import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int i,j;
        String str;
        int a,b;
        while(true){
            a=scan.nextInt();
            b=scan.nextInt();
            if(a==0&&b==0)System.exit(0);
            str="";
            for(i=0;i<b;i++)str=str+"#";
            for(i=0;i<a;i++)System.out.println(str);
            System.out.println();
        }
   }
}
