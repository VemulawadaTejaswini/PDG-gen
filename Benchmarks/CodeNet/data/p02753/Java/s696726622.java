

import java.util.Scanner;

public class Main {
    public static void main(String[] a){
        Scanner scanner=new Scanner(System.in);
        //int t=scanner.nextInt();
        String string=scanner.next();
        int aa=0,b=0;
        for(int j=0;j<string.length();j++){
            if(string.charAt(j)=='A'){
                aa++;
            }
            else{
                b++;
            }
        }
        if(aa==0 || b==0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
