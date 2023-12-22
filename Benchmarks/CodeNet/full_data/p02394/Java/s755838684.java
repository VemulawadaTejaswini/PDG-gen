import java.util.Scanner;

	class Main{
		public static void main(String[]args){
            
            
        Scanner sc=new Scanner(System.in);
            int W,H,x,y,r;
            W=sc.nextInt();
            H=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();
            r=sc.nextInt();
            
			if(x-r<0||W<x+r)System.out.println("No");
            else if(y-r<0||H<y+r)System.out.println("No");
            else System.out.println("Yes");
            sc.close();
        }
    }
