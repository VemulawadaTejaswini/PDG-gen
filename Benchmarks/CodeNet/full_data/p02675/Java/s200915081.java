import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N=scan.nextLine();
        if(N.length()==1){
            char ch0=N.charAt(0);
            if(ch0=='2'||ch0=='4'||ch0=='5'||ch0=='7'||ch0=='9'){
                System.out.println("hon");
            }
            else if(ch0=='0'||ch0=='1'||ch0=='6'||ch0=='8'){
                System.out.println("pon");
            }
            else if(ch0=='3'){
                System.out.println("bon");
            }
        }
        else if(N.length()==2){
            char ch1=N.charAt(1);
            if(ch1=='2'||ch1=='4'||ch1=='5'||ch1=='7'||ch1=='9'){
                System.out.println("hon");
            }
            else if(ch1=='0'||ch1=='1'||ch1=='6'||ch1=='8'){
                System.out.println("pon");
            }
            else if(ch1=='3'){
                System.out.println("bon");
            }
        }
        else if(N.length()==3){
            char ch2=N.charAt(2);
            if(ch2=='2'||ch2=='4'||ch2=='5'||ch2=='7'||ch2=='9'){
                System.out.println("hon");
            }
            else if(ch2=='0'||ch2=='1'||ch2=='6'||ch2=='8'){
                System.out.println("pon");
            }
            else if(ch2=='3'){
                System.out.println("bon");
            }
        }
    }
}
