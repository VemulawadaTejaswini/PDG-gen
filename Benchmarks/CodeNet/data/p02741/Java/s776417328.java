import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   int k=kbd.nextInt();
   int[] su = new int[32];
   su[0]=su[1]=su[2]=su[4]=su[6]=su[10]=su[12]=su[14]=su[16]=su[18]=su[22]=su[28]=su[30]=1;
   su[3]=su[5]=su[8]=su[9]=su[13]=su[20]=su[21]=su[24]=su[25]=2;
   su[27]=su[29]=4;
   su[7]=su[11]=su[17]=su[19]=su[26]=5;
   su[15]=14;
   su[23]=15;
   su[31]=51;
  System.out.println(su[k-1]);
}
}
