import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int number[] = new int[N];
        
        for(int i=0;i<number.length;i++)
        	number[i] = in.nextInt();

        int ans = 0;
        int sum=0;
        
        for(int i=0;i<number.length;i++){
        	sum = 0;
        	for(int j=i;j<number.length;j++){
        		sum+=number[j];
//        		System.out.println(sum);
        		if(sum==0)	ans++;
        	}
        }
        		
        		

        System.out.println(ans);

        in.close();
    }

}
