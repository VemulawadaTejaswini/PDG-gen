import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=0,b=0,c,i;
        Scanner sc=new Scanner(System.in);
        for(;;){
        try{
        a=sc.nextInt();
        b=sc.nextInt();
        }
        catch (Exception e) {
            System.exit(0);
        }
             
         
         
        c=a+b;
        for(i=1;;i++){
            int d=c/10;
            if(d==0)break;
            c=d;
                     
        }
        System.out.println(i);
     
 
}
}
}