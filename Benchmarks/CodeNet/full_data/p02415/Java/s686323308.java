import java.io.*;
public class Main{
 public static void main(String[] args)throws IOException{
 BufferedReader br=new BefferedReader(new InputStreamReader(System.in));
     String input=br.readLine();
     for(int i=0;i<input.length();i++){
         char a=input.charAt(i);
         if(Charracter.isUpperCase(a)){
           System.out.print(Character.toLowerCase(a));
         }else{
               system.out.print(Character.toUpperCase(a));
         }
     }
     System.out.print("\n");
 }
}