import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    
    for(int i=0; i<1000000; i++){
       for(int j=0; j<100000; j++){
          for(int k=0; k<100000; k++){
             for(int l=0; l<100000; l++){
                for(int m=0; m<100000; m++){
                   for(int n=0; n<100000; n++){

                      if(i*100 + j*101 + k*102 + l*103 + m*104 + n*105 == X){
                        System.out.println(1);
                      }
               
                      else{
                        System.out.println(0);
                      }
                   }
                }
             }
          }
       }
    }
  }
}
