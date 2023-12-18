import java.util.*;

public class Main{

	public static int contains(int[] array,int a){
		int c=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==a){
				c=1;
				break;
			}else{
				c=2;
			}
		}return c;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1 && n<=999){
			System.out.println("ABC");
		}else{
			System.out.println("ABD");
		}
	}
}
