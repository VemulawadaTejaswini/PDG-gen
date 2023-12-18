import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String odd=scan.next();
        String even=scan.next();
        int i;
        String original="p";

        //System.out.println(original);

        if(odd.length()==even.length()){
            for(i=0;i<odd.length();i++){
                if(i==0){
                    original=odd.substring(i,i+1);
                    original=original+even.substring(i,i+1);
                }
                else{
                    original=original+odd.substring(i,i+1);
                    original=original+even.substring(i,i+1);
                }
                //System.out.println(odd.substring(i,i+1));
                //System.out.println(original);
            }
            original=original.substring(0,2*odd.length());
            System.out.println(original);
        }

        else if(odd.length()!=even.length()){
            for(i=0;i<odd.length();i++){
                if(i==0){
                    original=odd.substring(i,i+1);
                    original=original+even.substring(i,i+1);
                }
                else if(i!=odd.length()-1){
                    original=original+odd.substring(i,i+1);
                    original=original+even.substring(i,i+1);
                }
                else{
                    original=original+odd.substring(i,i+1);
                }
                //System.out.println(original);
            }
            original=original.substring(0,2*odd.length()-1);
            System.out.println(original);
        }
    }
}