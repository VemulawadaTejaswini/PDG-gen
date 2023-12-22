import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] i = new int[10];
	int a = 0;
	while(true){
				i[a] =sc.nextInt();
				if(i[a] == 0)break;
				a++;
				}
	for(int b=0; b<a; b++){
		System.out.println("Case "+(b+1)+": "+i[b]);
	}
		
	}
}