

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char A[] = new char[200000];
		A = sc.next().toCharArray();
		int max=1;
		int count=0;
		boolean flag=false;
		for(int i=0;i<=A.length-max;i++){
			if(A[i]=='A'){
				count=1;
				flag=true;
				continue;
			}
			else if(A[i]=='Z'){
				count++;
				max=count;
			}
			else if(flag){
				count++;
			}
		}
	if(max<=1){System.out.println("0");}
	else{System.out.println(max);}
	
	}
}
