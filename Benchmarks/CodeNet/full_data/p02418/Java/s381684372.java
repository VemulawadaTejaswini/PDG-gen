import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       String str = scan.nextLine();
       String str2 = scan.nextLine();
       boolean a = false;

       for(int i=0;i<str.length();i++){

          str =str.charAt(str.length()-1)+str.substring(0,str.length()-1);

          String str3 =str.substring(0,str2.length());

             if(str3.equals(str2)){

                a = true;

             }

       }

       if(a){
          System.out.println("Yes");
       }else{
          System.out.println("No");
       }

       }
   }
