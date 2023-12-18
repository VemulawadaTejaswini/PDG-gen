import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int k = scn.nextInt();
      	int[] x= new int[b-a+1];
      	for(int i=0; i<x.length; ++i){
			x[i] = a+i;
		}
      	if(k>(a+b)/2-a){
        	for(int i=0; i<x.length; ++i){
				System.out.println(x[i]);
			}
        }else if(a==b){
          System.out.println(a);
        }else{
         	for(int i=0; i<k; ++i){
				System.out.println(x[i]);
			}
          	for(int i=x.length-k; i<x.length; ++i){
				System.out.println(x[i]);
			}
        }
	}
}
