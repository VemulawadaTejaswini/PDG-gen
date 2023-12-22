import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        long a,b,i,total=0,max=0,min=0;

        a = sc.nextInt();
        for(i=0;i<a;i++){
        b = sc.nextInt();
        if(i==0){
            max=b;
            min=b;
        }
            if(max<b)max=b;
            if(min>b)min=b;
            total+=b;
        }
        System.out.println(min+" "+max+" "+total);
   }
}
