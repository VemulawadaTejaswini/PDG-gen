import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		
		char[][] list = new char [10][N];
		char[] tempList = new char [10];
		
		for (int index=0; index<N; index++){
		    String s = sc.next();
		   for (int index2=0; index2<10; index2++){
		       tempList[index2] = s.charAt(index2);
		   }
		   Arrays.sort(tempList);
		   for (int index2=0; index2<10; index2++){
		       list[index2][index] = tempList[index2];
		   }
		}
		
		long count = 0;
		
		for (int index=0; index<N; index++){
            for (int index2=index+1; index2<N; index2++){
		        if (check(list,index,index2)){
		            count++;
		        }
		    }
		}
		
		System.out.println(count);
		
		sc.close();
	}
	
	static boolean check (char [][] list,int index, int index2){
	    boolean flag = true;
	    for (int index3=0; index3<10; index3++){
	        if (list[index3][index]!=list[index3][index2]){
	            flag=false;
	            break;
	        }
	    }
	    return flag;
	}
}