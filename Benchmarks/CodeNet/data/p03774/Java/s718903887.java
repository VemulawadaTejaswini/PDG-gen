import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  // String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
     String[] S=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyuA);

int N=Integer.parseInt(S[0]);
int M=Integer.parseInt(S[1]);

int[][] numN=new int[N][2];
int[][] numM=new int[M][2];

for(int i=0;i<N;i++){
     S=sc.nextLine().split(" ");
numN[i][0]=Integer.parseInt(S[0]);
numN[i][1]=Integer.parseInt(S[1]);
}
for(int i=0;i<M;i++){
     S=sc.nextLine().split(" ");
numM[i][0]=Integer.parseInt(S[0]);
numM[i][1]=Integer.parseInt(S[1]);
}

for(int i=0;i<N;i++){
int min=1000;
int soe=0;
for(int j=M-1;j>=0;j--){
int temp=Math.abs(numN[i][0]-numM[j][0])+Math.abs(numN[i][1]-numM[j][1]);
//System.out.println(temp+"-"+i+"-"+j);
if(temp<=min){
//System.out.println("soe");

min=temp;
soe=j+1;
}//if

}
System.out.println(soe);
}


//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}