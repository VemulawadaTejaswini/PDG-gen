import java.util.Scanner;

	class Main{
		public static void main(String[]args){
            
            
        Scanner sc=new Scanner(System.in);
            int a,b,c,i,j,count=0;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
              for(j=a;j<=b;j++)if(c%j==0)count++;
            System.out.println(count);
        }
    }
