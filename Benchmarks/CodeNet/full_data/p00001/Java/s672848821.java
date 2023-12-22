import java.util.Scanner;
class Main{
	    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
long XX[]=new long[10];
long YY[]=new long[3];
long max;
int s=0;
int m=9;
  for(int i=0;i<10;i++){
	  XX[i]=sc.nextInt();
	  s++;
  }
 max=XX[9];
 for(int i=0;i<3;i++){
	 for(int j=0;j<10;j++){
	 if(XX[j]>max){
		 max=XX[j];
		 m=j;
	 }
	}
	 YY[i]=max;
	 XX[m]=0;
	 s--;
max=XX[s];	 
 }
 for(int i=0;i<3;i++){
	 System.out.println(YY[i]);
 }
    }
}