import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int ap,bp;
		int as=0,bs=0;
		for(int i=0;i<n;i++){
			ap=(int)(Math.random()*10);
			bp=(int)(Math.random()*10);
			System.out.println(ap+" "+bp);
			if(ap>bp) as+=ap+bp;
			else if(ap<bp) as+=ap+bp;
			else {as+=ap;bs+=bp;}
		}
		System.out.println("\n"+as+" "+bs);
	}
}