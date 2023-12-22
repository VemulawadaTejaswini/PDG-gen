import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        Integer in;
        String number;
        char[] num=new char[1000];
        int result=0;
        int add=0;
        
        while(true){
            in=scan.nextInt();
            if(in==0){
                break;
            }
            number=in.toString();
            
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