import java.util.Scanner;
        public class Main{
      		public static void main (String args[]){

                    int n=0;
             //     System.out.println("Aを入力してください");
                		Scanner scan = new Scanner(System.in);
     					int A = scan.nextInt();
                if(A == 5 && A==7){
                     //   System.out.println("Bを入力してください");
                		Scanner scan2 = new Scanner(System.in);
     				int B  = scan2.nextInt();
                	if(B == 5 && B==7){
                      	if(A + B ==12){
                          A=0; B=0;
                          System.out.println("NO");
                       //   break;
                        }
                    //        System.out.println("Cを入力してください");
                      Scanner scan3 = new Scanner(System.in);
     					int C = scan3.nextInt();
                      	if(A + B + C == 17){
                          	System.out.println("Yes");
                        }
                      	else{
                            System.out.println("No");
                          //break;
                        }
                    }
                 
                }
              else{
                System.out.println("NO");
              
 }
 }
