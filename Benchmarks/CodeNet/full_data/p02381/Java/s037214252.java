import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       while(true){

       int n = scan.nextInt();

       if(n==0){

          break;

       }

       int s[] = new int[n];
       double m = 0;
       double sum = 0;

       for(int i =0;i<n;i++){

          s[i]=scan.nextInt();
          m+=s[i];

       }

       m/=n;

       for(int j =0;j<n;j++){

          sum+=Math.pow(s[j]-m,2);

       }

       sum/=n;

       System.out.println(Math.sqrt(sum));

       }
       }
   }
