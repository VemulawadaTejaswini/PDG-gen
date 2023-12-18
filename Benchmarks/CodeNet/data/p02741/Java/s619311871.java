import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();


       int Ks[]=new int[32];
       Ks[0]=1;
       Ks[1]=1;
       Ks[2]=1;
       Ks[3]=2;
       Ks[4]=1;
       Ks[5]=2;
       Ks[6]=1;
       Ks[7]=5;
       Ks[8]=2;
       Ks[9]=2;
       Ks[10]=1;
       Ks[11]=5;
       Ks[12]=1;
       Ks[13]=2;
       Ks[14]=1;
       Ks[15]=14;
       Ks[16]=1;
       Ks[17]=5;
       Ks[18]=1;
       Ks[19]=5;
       Ks[20]=2;
       Ks[21]=2;
       Ks[22]=1;
       Ks[23]=15;
       Ks[24]=2;
       Ks[25]=2;
       Ks[26]=5;
       Ks[27]=4;
       Ks[28]=1;
       Ks[29]=4;
       Ks[30]=1;
       Ks[31]=51;


  System.out.println(Ks[K-1]);



    }
}
