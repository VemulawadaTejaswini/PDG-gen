import java.util.Scanner;

public class Main{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
                
        while(true){
            String x=sc.next();
            int i=0;
            int sum=0;
            
            if(x.equals("0")){
                break;
            }
         
            while(i<x.length()){
                String piv=String.valueOf(x.charAt(i));
                switch (piv) {
                    case "1" :
                        sum+=1;
                        break;
                    case "2" :
                        sum+=2;
                        break;
                    case "3" :
                        sum+=3;
                        break;
                    case "4" :
                        sum+=4;
                        break;
                    case "5" :
                        sum+=5;
                        break;
                    case "6" :
                        sum+=6;
                        break;
                    case "7" :
                        sum+=7;
                        break;
                    case "8" :
                        sum+=8;
                        break;
                    case "9" :
                        sum+=9;
                        break;
                    case "0" :
                        sum+=0;
                        break;
                    default:
                        System.out.println("err");
                }
                i++;
            }
            System.out.println(sum);
        }
    }
}
