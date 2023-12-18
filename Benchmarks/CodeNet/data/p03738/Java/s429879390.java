import java.io.*;

public class Main {

        public static void main(String[] args){
                BufferedReader input1 =
                        new BufferedReader (new InputStreamReader (System.in));

                int num1 = 0;
                try{
                        String num1St = input1.readLine();
                        num1 = Integer.parseInt(num1St);
                }catch(Exception e){
                }



                BufferedReader input2 =
                        new BufferedReader (new InputStreamReader (System.in));

                int num2 = 0;
                try{
                        String num2St = input2.readLine();
                        num2 = Integer.parseInt(num2St);
                }catch(Exception e){
                }


                if(num1 > num2){
                        System.out.println("GREATER");
                }else if(num1 < num2){
                        System.out.println("LESS");
                }else{
                        System.out.println("EQUAL");
                }


        }

}