package Test;
import java.util.*;
public class Test23 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] hight = new int[10];
		for(int i=0;i<10;i++){
			hight[i]=sc.nextInt();
		}Arrays.sort(hight);
		for(int j=hight.length-1;j>hight.length-4;j--)		System.out.println(hight[j]);
	}
}