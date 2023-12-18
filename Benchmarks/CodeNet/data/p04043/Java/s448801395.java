import java.util.Scanner;
 class Main {

    public static void main(String[] args) {
   
        Scanner in=new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt(); 
        int s=(a+b+c);		
       if(s==17)
       {
        System.out.println("YSE");
           
    }else{System.out.println("NO");}
	}
    
}