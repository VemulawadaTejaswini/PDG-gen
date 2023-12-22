import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
     Scanner sc = new Scanner(System.in);
        int[] num;

       String str = sc.nextLine();
        num=new int[str.length()];

        for(int i=0; i<str.length();i++){
        
            num[i]=str.charAt(i);
            if(65<=num[i]&&num[i]<=90){
                num[i]=num[i]+32;
            } else if(97<=num[i]&&num[i]<=122){
                num[i]=num[i]-32;
            }

           System.out.print((char)num[i]);

        }


        System.out.println("");










        sc.close();
    }
}
