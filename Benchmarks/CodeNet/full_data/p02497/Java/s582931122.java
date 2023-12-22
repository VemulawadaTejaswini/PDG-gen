import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
while(true) {
int m = sc.nextInt();
int f = sc.nextInt();
int r = sc.nextInt();
if (m == -1 && f == -1 && r == -1 ) {
		break;
			}

int M = m + f;
if (m ==-1 || f == -1 || M < 30 ){
		System.out.println("F");
			}else{
if(M > 79){
		System.out.println("A");
			}else{
if(M > 64){
		System.out.println("B");
			}else{
if(M > 49){
		System.out.println("C");
			}else{
if(r > 29){
		System.out.println("C");
			}else{
		System.out.println("D");
        
       }       
      }
     }
    } 
   }
  }
 }
}