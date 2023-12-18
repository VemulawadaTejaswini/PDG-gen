import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int k = sc.nextInt();
		int i=0;
		int h = 1;
		while(k-->0){
			int u=sc.nextInt();
			while(u-->0){
				System.out.print(h+" ");
				i++;
				if(i==m){
					System.out.println();
					i = 0;
				}
			}
			h++;
		}
	}
}
