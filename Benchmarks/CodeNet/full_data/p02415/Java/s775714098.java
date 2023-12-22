import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        
        char[] text=new char[1200];
        String in="";
        String out="";
        
        in=scan.nextLine();
        text=in.toCharArray();
        
        for(int i=0;i<text.length;i++){
            if(Character.isUpperCase(text[i])){
                text[i]=Character.toLowerCase(text[i]);
            }else if(Character.isLowerCase(text[i])){
                text[i]=Character.toUpperCase(text[i]);
            }
        }
        
        out=String.valueOf(text);
        System.out.println(out);
        
    }   
     
}