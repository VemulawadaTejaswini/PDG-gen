import  java.util.Scanner;
          public class Main {
               public static void main(String[] args) {
                   Scanner scan = new Scanner(System.in);
                   int n;
                   n = scan.nextInt();
                   int Ar[] = new int[2*n];
                     for(int i=0;i<2*n;i++){
                         Ar[i]=scan.nextInt();
                     }
                     int count=0;
                     for(int j=0;j<2*n;j=j+2){
                          if(Ar[j]==Ar[j+1]){
                              count++;
                          }
                     }
                     if(count>=3) System.out.println("Yes");
                     else System.out.println("No");
               }
          }