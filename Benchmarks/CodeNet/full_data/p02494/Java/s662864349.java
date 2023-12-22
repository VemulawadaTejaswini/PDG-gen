import java.util.Scanner;

public class BL{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[] H =new int[100000];
  int[] W =new int[100000];
  int i=0;
  H[0]=sc.nextInt();
  W[0]=sc.nextInt();
  for(i=1;H[i-1]!=0||W[i-1]!=0;i++){
   H[i]=sc.nextInt();
   W[i]=sc.nextInt();
  }
for(int m=0;m<i;m++){
 int k,l;
   for(k=0;k<H[m];k++){
    for(l=0;l<W[m];l++){
     System.out.printf("#");
     }
      System.out.printf("\n");
   }
  System.out.printf("\n");
  }
 }
}