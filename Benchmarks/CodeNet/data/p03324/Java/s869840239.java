import java.util.*;


class Main {
    public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);
   		int d=sc.nextInt(),n=sc.nextInt();
   		if(d==0)System.out.println(n);
   		else{
   			int num=(int)Math.pow(100,d);
   			System.out.println(num*n);
   			
   		}
   		sc.close();
    }
}