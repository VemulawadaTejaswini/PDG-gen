import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        String in;
        String number;
        char[] num=new char[1000];
        int result=0;
        int add=0;
        
        while(true){
            in=scan.nextLine();
            if(in.equals("0")){
                break;
            }
            number=in;
            
            num=number.toCharArray();
            result=0;
            for(int i=0;i<num.length;i++){
                add=Character.digit(num[i], 10);
                result+=add;
            }
            System.out.println(result);
        }
        
    }   
     
}