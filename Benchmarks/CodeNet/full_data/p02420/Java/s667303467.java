import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      while (true) {
          
            String line = sc.next();
            if(line.equals("-")) {
                break;
            };
            int n = line.length();
            char[] str = new char[n];
            for(int i=0;i<n;i++){
                str[i] = line.charAt(i);

            }
        int m=sc.nextInt();
       for(int i=0;i<m;i++){
           int h=sc.nextInt();
           char hoge[]=new char[n];

           System.arraycopy(str, 0, hoge,0, n);
            for(int j=0;j<n;j++){

                str[j]=hoge[(j+h)%n];

            }
          
       }
       for(int k=0;k<n;k++){
        System.out.print(str[k]);

    }
    System.out.println("");



      }


    }
}
