import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Num = sc.next();
		String calc;
		int count=0;
        for(int i=0;i<Num.length()-3;i++){
        	for(int j=i+3;j<Num.length()+1;j++){
        		calc=Num.substring(i,j);
        		if(Long.parseLong(calc)%2019==0){
        			count+=1;
        			//System.out.println(calc);
        		}
        	}
        }
        System.out.println(count);
    }
}