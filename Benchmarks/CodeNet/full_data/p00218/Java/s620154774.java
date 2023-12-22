import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			
			for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if((a==100||b==100||c==100)||(a+b>=180)||(a+b+c>=240)){
                System.out.println("A");
            }else if(((a+b+c)/3>=80)||((a+b+c)>=50&&(a>=80||b>=80))){
                System.out.println("B");
            }else{
               System.out. println("C");
			}
		}
		}}}