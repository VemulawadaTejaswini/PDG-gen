import java.util.Scanner;

	class Main{
		public static void main(String[]args){
            
            
        Scanner sc=new Scanner(System.in);
            int x,y,i;
            for(i=0;i<3000;i++){
           		 x=sc.nextInt();
           		 y=sc.nextInt();
				 if(x==0&&y==0)break;
                System.out.println(Math.min(x,y)+" "+Math.max(x,y));
           }
        }
    }
