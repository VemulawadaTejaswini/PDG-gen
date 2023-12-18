
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
       
	public static void main(String[] args) {
		Scanner sdf = new Scanner(System.in);
		
                int t=1;
                while(t-->0){
                    int n=sdf.nextInt();
                    int k=0;
                    int []a=new int[n];
                    for(int i=0;i<n;i++){
                        a[i]=sdf.nextInt();
                        k=k+a[i];
                    }
                    k=(int)Math.ceil((double)k/(double)n);
                    int sum=0;
                    for(int i=0;i<n;i++){
                        a[i]=(int)Math.pow(a[i]-k, 2);
                        sum=sum+a[i];
                    }
                    System.out.println(sum);
                    
                
                }                
        }
   


}