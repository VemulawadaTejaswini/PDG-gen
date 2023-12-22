package volume000_001;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ptr=0;
		int[] stack=new int[10];
		while(sc.hasNext()){
			int x=sc.nextInt();
			if(x==0){
				try{
					if(stack[ptr-1]!=0){
						System.out.println(stack[ptr-1]);
						stack[ptr-1]=0;
						ptr--;
					}
				}catch(ArrayIndexOutOfBoundsException e){					
				}
			}else{
				stack[ptr]=x;
				ptr++;
			}
		}
	}
}