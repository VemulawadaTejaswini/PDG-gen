import java.util.Scanner;
class Main{
	    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int XX[]=new int[10];
int max;
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
	 System.out.println(max);
	 XX[m]=0;
	 s--;
max=XX[s];	 
 }
    }
}