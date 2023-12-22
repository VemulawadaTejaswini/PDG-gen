import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
public static void main(String args[]){
 
    Scanner scan = new Scanner(System.in);
    try{
	int W[] = new int[250];
	
	int H[] = new int[250];
   
	int cnt=0;

while(true){
     W[cnt]= scan.nextInt();
     H[cnt]=scan.nextInt();
     
     if ( H[cnt] == 0 && W[cnt]==0 ) break;
     cnt++;

}     


 for ( int p = 0; p < cnt; p++ ){
     for ( int i = 0; i < W[p]; i++ ){
	 for ( int j = 0; j < H[p]; j++ ){
	     if(i==0||i==W[p]-1 ||j==0 ||j==H[p]-1){
		 System.out.print("#");
	     } else {
		 System.out.print(".");
	     }
	 }
System.out.print("\n");
	
     }System.out.print("\n");
 }
 
}catch (InputMismatchException e) {
            System.out.println("try again!!");
        }
 
 
 
 
 
}
}

