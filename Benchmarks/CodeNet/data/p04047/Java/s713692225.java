import java.util.Scanner;
import java.util.Arrays;

public class AA{
	public static void main(String[] args){
	Scanner kbs=new Scanner(System.in);
	int kushi=kbs.nextInt();
	int goukei=0;
	int[] nagasa=new int[2*kushi];
	for(int i=0;i<2*kushi;i++){
		nagasa[i]=kbs.nextInt();
	}
	Arrays.sort(nagasa);
	for(int i=0;i<2*kushi;i+=2){
		goukei+=nagasa[i];
	}
	System.out.println(goukei);
		}
		
	}
